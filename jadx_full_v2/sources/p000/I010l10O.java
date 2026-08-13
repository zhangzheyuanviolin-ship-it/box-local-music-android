            package p000;
            
            public final class I010l10O extends Throwable {
                public final int I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I010l10O(String str, int i) {
/* 3 */             super(str);
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public Throwable fillInStackTrace() {
                    switch (this.I00iOIl) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
/* 10 */                    return this;
                        case 1:
                        default:
/* 6 */                     return super.fillInStackTrace();
                    }
                }
            }
