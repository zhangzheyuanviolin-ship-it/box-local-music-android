            package p000;

            import java.util.ArrayList;
            import java.util.Map;
            import java.util.concurrent.Executor;
            
            public final class Oilo110oloIl {
                public int I00000oIO;
                public ArrayList I00000oOI;
                public ArrayList I0000Il00O;
                public Executor I0000O;
                public IO0Il0o1OI I0000oI00;
                public int I0001Ioi1lo;
                public Map I000II;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 77 */                return true;
                    }
/* 7 */             if (obj instanceof Oilo110oloIl) {
/* 10 */                Oilo110oloIl oilo110oloIl = (Oilo110oloIl) obj;
/* 16 */                if (this.I00000oIO == oilo110oloIl.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oilo110oloIl.I00000oOI) && this.I0000Il00O.equals(oilo110oloIl.I0000Il00O) && this.I0000O.equals(oilo110oloIl.I0000O) && this.I0000oI00 == oilo110oloIl.I0000oI00 && this.I0001Ioi1lo == oilo110oloIl.I0001Ioi1lo && this.I000II.equals(oilo110oloIl.I000II)) {
/* 77 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = Integer.hashCode(this.I00000oIO) * 31;
/* 10 */            ArrayList arrayList = this.I00000oOI;
/* 54 */            return Oi010OO0.I000iOII(this.I000II, IIl001iO0Io.I0000O(this.I0001Ioi1lo, (this.I0000oI00.hashCode() + ((this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31);
                }

                public final String toString() {
/* 88 */            return "SessionConfigData(sessionType=" + this.I00000oIO + ", inputConfiguration=" + this.I00000oOI + ", outputConfigurations=" + this.I0000Il00O + ", executor=" + this.I0000O + ", stateCallback=" + this.I0000oI00 + ", sessionTemplateId=" + this.I0001Ioi1lo + ", sessionParameters=" + this.I000II + ", sessionColorSpace=" + ((Object) "null") + ')';
                }
            }
