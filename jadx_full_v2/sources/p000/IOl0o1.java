            package p000;
            
            public final class IOl0o1 {
                public final int I00000oIO;
                public final Integer I00000oOI;

                public IOl0o1(int i, lOO101ooiO loo101ooio, Integer num) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = num;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IOl0o1)) {
/* 7 */                 return false;
                    }
/* 11 */            IOl0o1 iOl0o1 = (IOl0o1) obj;
                    return this.I00000oIO == iOl0o1.I00000oIO && O0000Ioio00.I0000O(null, null) && O0000Ioio00.I0000O(this.I00000oOI, iOl0o1.I00000oOI);
                }

                public final int hashCode() {
/* 11 */            int iHashCode = ((Integer.hashCode(this.I00000oIO) * 31) + 0) * 31;
/* 13 */            Integer num = this.I00000oOI;
/* 22 */            return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public final String toString() {
/* 37 */            return "ComposeStackTraceFrame(groupKey=" + this.I00000oIO + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.I00000oOI + ")";
                }
            }
