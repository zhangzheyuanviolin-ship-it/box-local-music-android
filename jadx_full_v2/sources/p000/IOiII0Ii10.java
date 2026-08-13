            package p000;

            import kotlin.jvm.functions.Function3;
            
/* 22 */    public final class IOiII0Ii10 {
                public final Object I00000oIO;
                public final IIoOOiIO0o1I I00000oOI;
                public final Function3 I0000Il00O;
                public final Object I0000O;
                public final Throwable I0000oI00;

                public IOiII0Ii10(Object obj, IIoOOiIO0o1I iIoOOiIO0o1I, Function3 function3, Throwable th, int i) {
/* 20 */            this(obj, (i & 2) != 0 ? null : iIoOOiIO0o1I, (i & 4) != 0 ? null : function3, (Object) null, (i & 16) != 0 ? null : th);
                }

                public static IOiII0Ii10 I00000oIO(IOiII0Ii10 iOiII0Ii10, IIoOOiIO0o1I iIoOOiIO0o1I, Throwable th, int i) {
/* 1 */             Object obj = iOiII0Ii10.I00000oIO;
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 iIoOOiIO0o1I = iOiII0Ii10.I00000oOI;
                    }
/* 9 */             IIoOOiIO0o1I iIoOOiIO0o1I2 = iIoOOiIO0o1I;
/* 10 */            Function3 function3 = iOiII0Ii10.I0000Il00O;
/* 12 */            Object obj2 = iOiII0Ii10.I0000O;
/* 16 */            if ((i & 16) != 0) {
/* 18 */                th = iOiII0Ii10.I0000oI00;
                    }
/* 23 */            return new IOiII0Ii10(obj, iIoOOiIO0o1I2, function3, obj2, th);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOiII0Ii10)) {
/* 7 */                 return false;
                    }
/* 11 */            IOiII0Ii10 iOiII0Ii10 = (IOiII0Ii10) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iOiII0Ii10.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iOiII0Ii10.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, iOiII0Ii10.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iOiII0Ii10.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, iOiII0Ii10.I0000oI00);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.I00000oIO;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            IIoOOiIO0o1I iIoOOiIO0o1I = this.I00000oOI;
/* 25 */            int iHashCode2 = (iHashCode + (iIoOOiIO0o1I == null ? 0 : iIoOOiIO0o1I.hashCode())) * 31;
/* 27 */            Function3 function3 = this.I0000Il00O;
/* 38 */            int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
/* 40 */            Object obj2 = this.I0000O;
/* 51 */            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
/* 53 */            Throwable th = this.I0000oI00;
/* 62 */            return iHashCode4 + (th != null ? th.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "CompletedContinuation(result=" + this.I00000oIO + ", cancelHandler=" + this.I00000oOI + ", onCancellation=" + this.I0000Il00O + ", idempotentResume=" + this.I0000O + ", cancelCause=" + this.I0000oI00 + ')';
                }

/* 23 */        public IOiII0Ii10(Object obj, IIoOOiIO0o1I iIoOOiIO0o1I, Function3 function3, Object obj2, Throwable th) {
/* 25 */            this.I00000oIO = obj;
/* 26 */            this.I00000oOI = iIoOOiIO0o1I;
/* 27 */            this.I0000Il00O = function3;
/* 28 */            this.I0000O = obj2;
/* 29 */            this.I0000oI00 = th;
                }
            }
