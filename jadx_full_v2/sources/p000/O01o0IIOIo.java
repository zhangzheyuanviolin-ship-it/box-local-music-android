            package p000;
            
            public final class O01o0IIOIo {
                static final int CLOSED = 8;
                static final int DANGLING_NAME = 4;
                static final int EMPTY_ARRAY = 1;
                static final int EMPTY_DOCUMENT = 6;
                static final int EMPTY_OBJECT = 3;
                static final int NONEMPTY_ARRAY = 2;
                static final int NONEMPTY_DOCUMENT = 7;
                static final int NONEMPTY_OBJECT = 5;
                static final int STREAMING_VALUE = 9;

                private O01o0IIOIo() {
                }

                public static String getPath(int i, int[] iArr, String[] strArr, int[] iArr2) {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 9 */             for (int i2 = 0; i2 < i; i2++) {
/* 11 */                int i3 = iArr[i2];
/* 14 */                if (i3 == 1 || i3 == 2) {
/* 44 */                    sb.append('[');
/* 49 */                    sb.append(iArr2[i2]);
/* 54 */                    sb.append(']');
                        } else if (i3 == 3 || i3 == 4 || i3 == 5) {
/* 31 */                    sb.append('.');
/* 34 */                    String str = strArr[i2];
/* 36 */                    if (str != null) {
/* 38 */                        sb.append(str);
                            }
                        }
                    }
/* 60 */            return sb.toString();
                }
            }
