            package p000;

            import android.net.NetworkRequest;
            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class IOo0o10i1IO {
                public static final IOo0o10i1IO I000OiO;
                public OIIOlI I00000oIO;
                public OIIOOo I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public long I000II;
                public long I000O01llI0;
                public Set I000OOo1O;

                static {
/* 3 */             OIIOlI oIIOlI = OIIOlI.I00iOIl;
/* 5 */             IOo0o10i1IO iOo0o10i1IO = new IOo0o10i1IO();
/* 14 */            iOo0o10i1IO.I00000oOI = new OIIOOo(null);
/* 16 */            iOo0o10i1IO.I00000oIO = oIIOlI;
/* 19 */            iOo0o10i1IO.I0000Il00O = false;
/* 21 */            iOo0o10i1IO.I0000O = false;
/* 23 */            iOo0o10i1IO.I0000oI00 = false;
/* 25 */            iOo0o10i1IO.I0001Ioi1lo = false;
/* 29 */            iOo0o10i1IO.I000II = -1L;
/* 31 */            iOo0o10i1IO.I000O01llI0 = -1L;
/* 35 */            iOo0o10i1IO.I000OOo1O = Il01llIol0.I00iOIl;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            I000OiO = iOo0o10i1IO;
                }

                public IOo0o10i1IO(OIIOOo oIIOOo, OIIOlI oIIOlI, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
/* 4 */             this.I00000oOI = oIIOOo;
/* 6 */             this.I00000oIO = oIIOlI;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = z2;
/* 12 */            this.I0000oI00 = z3;
/* 14 */            this.I0001Ioi1lo = z4;
/* 16 */            this.I000II = j;
/* 18 */            this.I000O01llI0 = j2;
/* 20 */            this.I000OOo1O = set;
                }

                public final NetworkRequest I00000oIO() {
/* 5 */             return (NetworkRequest) this.I00000oOI.I00000oIO;
                }

                public final boolean I00000oOI() {
/* 9 */             return !this.I000OOo1O.isEmpty();
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || !IOo0o10i1IO.class.equals(obj.getClass())) {
/* 5 */                 return false;
                    }
/* 21 */            IOo0o10i1IO iOo0o10i1IO = (IOo0o10i1IO) obj;
/* 27 */            if (this.I0000Il00O == iOo0o10i1IO.I0000Il00O && this.I0000O == iOo0o10i1IO.I0000O && this.I0000oI00 == iOo0o10i1IO.I0000oI00 && this.I0001Ioi1lo == iOo0o10i1IO.I0001Ioi1lo && this.I000II == iOo0o10i1IO.I000II && this.I000O01llI0 == iOo0o10i1IO.I000O01llI0 && O0000Ioio00.I0000O(I00000oIO(), iOo0o10i1IO.I00000oIO()) && this.I00000oIO == iOo0o10i1IO.I00000oIO) {
/* 95 */                return O0000Ioio00.I0000O(this.I000OOo1O, iOo0o10i1IO.I000OOo1O);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 27 */            int iHashCode = ((((((((this.I00000oIO.hashCode() * 31) + (this.I0000Il00O ? 1 : 0)) * 31) + (this.I0000O ? 1 : 0)) * 31) + (this.I0000oI00 ? 1 : 0)) * 31) + (this.I0001Ioi1lo ? 1 : 0)) * 31;
/* 29 */            long j = this.I000II;
/* 38 */            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
/* 40 */            long j2 = this.I000O01llI0;
/* 56 */            int iHashCode2 = (this.I000OOo1O.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
/* 58 */            NetworkRequest networkRequestI00000oIO = I00000oIO();
/* 70 */            return iHashCode2 + (networkRequestI00000oIO != null ? networkRequestI00000oIO.hashCode() : 0);
                }

                public final String toString() {
/* 88 */            return "Constraints{requiredNetworkType=" + this.I00000oIO + ", requiresCharging=" + this.I0000Il00O + ", requiresDeviceIdle=" + this.I0000O + ", requiresBatteryNotLow=" + this.I0000oI00 + ", requiresStorageNotLow=" + this.I0001Ioi1lo + ", contentTriggerUpdateDelayMillis=" + this.I000II + ", contentTriggerMaxDelayMillis=" + this.I000O01llI0 + ", contentUriTriggers=" + this.I000OOo1O + ", }";
                }
            }
