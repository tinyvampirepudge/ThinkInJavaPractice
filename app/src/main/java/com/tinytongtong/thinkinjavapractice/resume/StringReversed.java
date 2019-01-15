package com.tinytongtong.thinkinjavapractice.resume;

/**
 * 
 * @author tiny desc: 怎么把，I am a student 换成 student a am I
 *         不能开辟新的空间：当做一个Char[]来处理。
 *         http://blog.csdn.net/perfectnihil/article/details/76737704å
 *
 */
public class StringReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cs = "I am a student".toCharArray();
		// System.out.println(doReverse(cs));

		System.out.println(doReverse1(cs));
	}

	public static char[] doReverse(char[] mCharSeq) {
		int prePoint = 0;
		int currentPoint;
		// 调整单词顺序
		for (int i = 0; i < mCharSeq.length; i++) {
			if (mCharSeq[i] == ' ' || i == mCharSeq.length - 1) {
				currentPoint = i;
				if (i == mCharSeq.length - 1) {
					currentPoint = i + 1;
				}

				int length = currentPoint - prePoint;
				for (int j = 0; j < length / 2; j++) {
					int point1 = j + prePoint;
					int point2 = currentPoint - j - 1;
					mCharSeq[point1] = (char) (mCharSeq[point1] ^ mCharSeq[point2]);
					mCharSeq[point2] = (char) (mCharSeq[point1] ^ mCharSeq[point2]);
					mCharSeq[point1] = (char) (mCharSeq[point1] ^ mCharSeq[point2]);
				}
				prePoint = currentPoint + 1;
			}
		}
		// 调整整体顺序
		for (int i = 0; i < mCharSeq.length / 2; i++) {
			int point1 = i;
			int point2 = mCharSeq.length - i - 1;
			mCharSeq[point1] = (char) (mCharSeq[point1] ^ mCharSeq[point2]);
			mCharSeq[point2] = (char) (mCharSeq[point1] ^ mCharSeq[point2]);
			mCharSeq[point1] = (char) (mCharSeq[point1] ^ mCharSeq[point2]);
		}

		return mCharSeq;
	}

	public static char[] doReverse1(char[] chars) {
		// 替换单词内部的顺序，开始角标和结束角标，包含头不包含尾。
		int indexStart = 0;
		int indexEnd = 0;
		for (int i = 0; i < chars.length; i++) {
			if (' ' == chars[i] || chars.length - 1 == i) {
				indexEnd = i;
				if (chars.length - 1 == i) {
					indexEnd = chars.length;
				}

				int length = indexEnd - indexStart;
				for (int j = 0; j < length / 2; j++) {
					int j1 = j + indexStart;
					int j2 = indexEnd - j - 1;
					chars[j1] = (char) (chars[j1] ^ chars[j2]);
					chars[j2] = (char) (chars[j1] ^ chars[j2]);
					chars[j1] = (char) (chars[j1] ^ chars[j2]);
				}
				indexStart = indexEnd + 1;
			}
		}

		// 以字符为单位，全部调换顺序
		for (int i = 0; i < chars.length / 2; i++) {
			int i1 = i;
			int i2 = chars.length - i - 1;
			chars[i1] = (char) (chars[i1] ^ chars[i2]);
			chars[i2] = (char) (chars[i1] ^ chars[i2]);
			chars[i1] = (char) (chars[i1] ^ chars[i2]);
		}

		return chars;
	}

}
