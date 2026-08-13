            package p000;

            import java.io.Serializable;
            
/* 8 */     public final class I00OI1 extends IllegalStateException {
                public final int I00iOIl;
                public Serializable I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00OI1(String str, Exception exc) {
/* 4 */             super(str);
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiI = exc;
                }

                @Override
                public Throwable getCause() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    return (Exception) this.I00iiI;
                        case 1:
/* 18 */                    return (Exception) this.I00iiI;
                        case 2:
/* 13 */                    return (Exception) this.I00iiI;
                        default:
/* 6 */                     return super.getCause();
                    }
                }

                @Override
                public String getMessage() {
                    switch (this.I00iOIl) {
                        case 3:
/* 13 */                    return (String) this.I00iiI;
                        default:
/* 6 */                     return super.getMessage();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public I00OI1(String str, int i) {
                    super(str);
/* 10 */            this.I00iOIl = i;
                }
            }
