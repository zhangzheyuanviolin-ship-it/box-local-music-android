            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IO10lIoiO {
                public static final IO10l0l0 I00000oOI = new IO10l0l0();
                public Object I00000oIO;

                public static final IO10lIoiO I00000oIO(Object obj) {
/* 3 */             IO10lIoiO iO10lIoiO = new IO10lIoiO();
/* 6 */             iO10lIoiO.I00000oIO = obj;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iO10lIoiO;
                }

                public static final Throwable I00000oOI(IO10l0l0 iO10l0l0) {
/* 9 */             IO10i1 iO10i1 = iO10l0l0 instanceof IO10i1 ? (IO10i1) iO10l0l0 : null;
/* 10 */            if (iO10i1 != null) {
/* 12 */                return iO10i1.I00000oIO;
                    }
/* 3 */             return null;
                }

                public static final Object I0000Il00O(Object obj) {
/* 3 */             if (obj instanceof IO10l0l0) {
/* 6 */                 return null;
                    }
/* 5 */             return obj;
                }

                public static final void I0000O(Object obj) {
/* 3 */             if (obj instanceof IO10l0l0) {
/* 8 */                 if (!(obj instanceof IO10i1)) {
/* 25 */                    I000II.I001IO000("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
/* 29 */                    return;
                        }
/* 12 */                Throwable th = ((IO10i1) obj).I00000oIO;
/* 14 */                if (th != null) {
/* 22 */                    throw th;
                        }
/* 18 */                I000II.I001IO000("Trying to call 'getOrThrow' on a channel closed without a cause");
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IO10lIoiO) && O0000Ioio00.I0000O(this.I00000oIO, ((IO10lIoiO) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             if (obj == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return obj.hashCode();
                }

                public final String toString() {
/* 1 */             Object obj = this.I00000oIO;
/* 5 */             if (obj instanceof IO10i1) {
/* 9 */                 return ((IO10i1) obj).toString();
                    }
/* 29 */            return "Value(" + obj + ')';
                }
            }
