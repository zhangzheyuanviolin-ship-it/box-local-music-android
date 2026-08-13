            package p000;

            import java.io.File;
            import java.util.ArrayDeque;
            
            public final class IlIl0i extends I011lIilI0lo {
                public ArrayDeque I00iiO;
                public IlIl0l I00iio;

                @Override
                public final void I00000oIO() {
                    File file;
                    File fileI00000oIO;
/* 1 */             ArrayDeque arrayDeque = this.I00iiO;
                    while (true) {
/* 7 */                 IlIl0i11 ilIl0i11 = (IlIl0i11) arrayDeque.peek();
/* 9 */                 if (ilIl0i11 == null) {
/* 11 */                    file = null;
                            break;
                        }
/* 13 */                fileI00000oIO = ilIl0i11.I00000oIO();
/* 17 */                if (fileI00000oIO == null) {
/* 19 */                    arrayDeque.pop();
                        } else if (fileI00000oIO.equals(ilIl0i11.I00000oIO) || !fileI00000oIO.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                            break;
                        } else {
/* 51 */                    arrayDeque.push(I00000oOI(fileI00000oIO));
                        }
                    }
/* 55 */            file = fileI00000oIO;
/* 56 */            if (file == null) {
/* 65 */                this.I00iOIl = 2;
                    } else {
/* 58 */                this.I00iiI = file;
/* 61 */                this.I00iOIl = 1;
                    }
                }

                public final IlIillI1i0oI I00000oOI(File file) {
/* 7 */             int iOrdinal = ((IlIl0l1lO) this.I00iio.I0000Il00O).ordinal();
/* 11 */            if (iOrdinal == 0) {
/* 29 */                return new IlIl0O(file);
                    }
/* 14 */            if (iOrdinal == 1) {
/* 18 */                return new IlIiololII(file);
                    }
/* 22 */            I000II.I00000oIO();
/* 25 */            return null;
                }
            }
