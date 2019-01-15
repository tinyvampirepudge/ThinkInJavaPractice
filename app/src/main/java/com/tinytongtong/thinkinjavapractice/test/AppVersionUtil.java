package com.tinytongtong.thinkinjavapractice.test;

public class AppVersionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("checkNeedUpgrade() --> " + checkNeedUpgrade());
	}

	private static String app_version = "1.9";
	private static String latest_android_version = "1.9.0";

	public static boolean checkNeedUpgrade() {// 检测是否需要更新。
		if (isEmpty(app_version) || isEmpty(latest_android_version)) {
			return false;
		}

		boolean result = false;
		String[] oldAppVer = app_version.split("\\.");
		String[] latestAppVer = latest_android_version.split("\\.");
		int minSize = Math.min(oldAppVer.length, latestAppVer.length);
		for (int j = 0; j < minSize; j++) {
			if (!result) {
				if (!isEmpty(oldAppVer[j]) && !isEmpty(latestAppVer[j])) {
					int oldVal = Integer.valueOf(oldAppVer[j]);
					int latestVal = Integer.valueOf(latestAppVer[j]);
					if (latestVal > oldVal) {
						result = true;
						break;
					}
				}
			}
		}
		if (!result && latestAppVer.length > minSize) {
			boolean isEqual = true;
			for (int j = 0; j < minSize; j++) {
				if (!oldAppVer[j].equals(latestAppVer[j])) {
					isEqual = false;
					break;
				}
			}
			if (isEqual) {
				result = true;
			}
		}
		return result;
	}

	public static boolean isEmpty(CharSequence str) {
		return str == null || str.length() == 0;
	}

}
