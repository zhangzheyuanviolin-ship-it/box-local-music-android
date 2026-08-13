            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            
/* 15 */    public class IOiIIo1l extends RuntimeException {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOiIIo1l(String str, ii0iI11ol ii0ii11ol) {
/* 13 */            super(IlIi0I0.I000lI("Unable to parse ", str, " protocol message."), ii0ii11ol);
/* 3 */             this.I00iOIl = 16;
                }

                public static IOiIIo1l I00000oIO(int i, int i2, String str, String str2) {
/* 9 */             return new IOiIIo1l(I0000oI00(i, i2, str, str2), 14);
                }

                public static IOiIIo1l I00000oOI(String str, int i, String str2) {
/* 11 */            return new IOiIIo1l(I0001Ioi1lo(i, i + 1, str, str2), 18);
                }

                public static IOiIIo1l I0000Il00O(String str, int i, String str2) {
/* 11 */            return new IOiIIo1l(I0000oI00(i, i + 1, str, str2), 14);
                }

                public static IOiIIo1l I0000O(int i, int i2, String str, String str2) {
/* 9 */             return new IOiIIo1l(I0001Ioi1lo(i, i2, str, str2), 18);
                }

                public static String I0000oI00(int i, int i2, String str, String str2) {
/* 1 */             if (i2 < 0) {
/* 3 */                 i2 = str2.length();
                    }
/* 9 */             StringBuilder sb = new StringBuilder(str);
/* 14 */            sb.append(": ");
/* 21 */            if (i > 8) {
/* 23 */                sb.append("...");
/* 28 */                sb.append((CharSequence) str2, i - 5, i);
                    } else {
/* 33 */                sb.append((CharSequence) str2, 0, i);
                    }
/* 38 */            sb.append('[');
/* 45 */            sb.append(str2.substring(i, i2));
/* 50 */            sb.append(']');
/* 58 */            if (str2.length() - i2 > 8) {
/* 62 */                sb.append((CharSequence) str2, i2, i2 + 5);
/* 65 */                sb.append("...");
                    } else {
/* 73 */                sb.append((CharSequence) str2, i2, str2.length());
                    }
/* 76 */            return sb.toString();
                }

                public static String I0001Ioi1lo(int i, int i2, String str, String str2) {
/* 1 */             if (i2 < 0) {
/* 3 */                 i2 = str2.length();
                    }
/* 9 */             StringBuilder sb = new StringBuilder(str);
/* 14 */            sb.append(": ");
/* 21 */            if (i > 8) {
/* 23 */                sb.append("...");
/* 28 */                sb.append((CharSequence) str2, i - 5, i);
                    } else {
/* 33 */                sb.append((CharSequence) str2, 0, i);
                    }
/* 38 */            sb.append('[');
/* 45 */            sb.append(str2.substring(i, i2));
/* 50 */            sb.append(']');
/* 58 */            if (str2.length() - i2 > 8) {
/* 62 */                sb.append((CharSequence) str2, i2, i2 + 5);
/* 65 */                sb.append("...");
                    } else {
/* 73 */                sb.append((CharSequence) str2, i2, str2.length());
                    }
/* 76 */            return sb.toString();
                }

                @Override
                public synchronized Throwable fillInStackTrace() {
                    switch (this.I00iOIl) {
                        case 14:
                            synchronized (this) {
                            }
/* 16 */                    return this;
                        case PoseLandmark.RIGHT_PINKY:
                            synchronized (this) {
                            }
/* 13 */                    return this;
                        default:
/* 6 */                     return super.fillInStackTrace();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public IOiIIo1l(String str, int i) {
                    super(str);
/* 17 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 17 */        public IOiIIo1l(String str, Throwable th, int i) {
                    super(str, th);
/* 18 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public IOiIIo1l(Throwable th, int i) {
                    super(th);
/* 19 */            this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public IOiIIo1l() {
/* 21 */            super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
                    this.I00iOIl = 11;
                }
            }
