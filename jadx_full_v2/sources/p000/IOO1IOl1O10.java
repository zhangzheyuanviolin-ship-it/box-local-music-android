            package p000;

            import java.io.File;
            import java.io.IOException;
            import java.util.Locale;
            
/* 61 */    public class IOO1IOl1O10 extends IOException {
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOO1IOl1O10(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i) {
/* 10 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                    switch (i) {
                        case 8:
/* 58 */                    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                            break;
                        case 9:
                        case 14:
                        case 15:
                        default:
                            break;
                        case 10:
/* 50 */                    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                            break;
                        case 11:
/* 42 */                    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                            break;
                        case 12:
/* 34 */                    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                            break;
                        case 13:
/* 26 */                    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                            break;
                        case 16:
/* 18 */                    super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                            break;
                    }
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 62 */        public IOO1IOl1O10(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
/* 63 */            Locale locale = Locale.US;
/* 64 */            StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "Pos: ", ", limit: ");
/* 65 */            sbI001iOo1i0O.append(j2);
                    sbI001iOo1i0O.append(", len: ");
                    sbI001iOo1i0O.append(i);
/* 66 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbI001iOo1i0O.toString()), indexOutOfBoundsException);
                }

/* 66 */        public IOO1IOl1O10(File file, File file2, String str) {
/* 67 */            StringBuilder sb = new StringBuilder(file.toString());
                    if (file2 != null) {
                        sb.append(" -> " + file2);
                    }
/* 69 */            sb.append(": ".concat(str));
/* 71 */            super(sb.toString());
                }

/* 71 */        public IOO1IOl1O10(Throwable th) {
/* 72 */            super(th != null ? th.getMessage() : null, th);
                }

/* 72 */        public IOO1IOl1O10(IndexOutOfBoundsException indexOutOfBoundsException) {
/* 73 */            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
                }
            }
