            package p000;
            
            public final class O011Oii0 {
                public final Integer I00000oIO;
                public final Object I00000oOI;

                public O011Oii0(Integer num, Object obj) {
/* 4 */             this.I00000oIO = num;
/* 6 */             this.I00000oOI = obj;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof O011Oii0)) {
/* 32 */                return false;
                    }
/* 9 */             O011Oii0 o011Oii0 = (O011Oii0) obj;
                    return this.I00000oIO.equals(o011Oii0.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o011Oii0.I00000oOI);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 9 */             Object obj = this.I00000oOI;
/* 30 */            return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
                }

                public final String toString() {
/* 28 */            return "JoinedKey(left=" + this.I00000oIO + ", right=" + this.I00000oOI + ")";
                }
            }
