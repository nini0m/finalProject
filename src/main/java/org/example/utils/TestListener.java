package org.example.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        ExtentReportManager.createTest(testName);
        Utils.logInfo("Test Started: " + testName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Utils.logPass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Utils.logFail("error: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Utils.logInfo("Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        ExtentReportManager.flushReports();
    }
}
