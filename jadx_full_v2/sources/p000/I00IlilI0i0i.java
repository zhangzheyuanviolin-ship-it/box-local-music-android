            package p000;

            import java.io.IOException;
            import java.io.Serializable;
            import java.security.GeneralSecurityException;
            
/* 7 */     public final class I00IlilI0i0i extends IOException {
                public final int I00iOIl;
                public Serializable I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00IlilI0i0i(String str, RuntimeException runtimeException, int i) {
/* 3 */             super(str);
/* 1 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = runtimeException;
                }

                @Override
                public Throwable getCause() {
                    switch (this.I00iOIl) {
                        case 0:
/* 23 */                    return (IllegalArgumentException) this.I00iiI;
                        case 1:
/* 18 */                    return (RuntimeException) this.I00iiI;
                        case 2:
                        default:
/* 6 */                     return super.getCause();
                        case 3:
/* 13 */                    return (GeneralSecurityException) this.I00iiI;
                    }
                }

                @Override
                public String getMessage() {
                    switch (this.I00iOIl) {
                        case 2:
/* 13 */                    return (String) this.I00iiI;
                        default:
/* 6 */                     return super.getMessage();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 8 */         public I00IlilI0i0i(String str, int i) {
                    super(str);
/* 9 */             this.I00iOIl = i;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public I00IlilI0i0i(Throwable th) {
                    super(th);
/* 10 */            this.I00iOIl = 2;
                }
            }
