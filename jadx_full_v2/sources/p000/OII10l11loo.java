            package p000;

            import java.util.List;
            
/* 57 */    public final class OII10l11loo {
                public final List I00000oIO;
                public final int I00000oOI;

                public OII10l11loo(int i, List list) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = i;
/* 12 */            if (list.isEmpty() && i == -1) {
/* 37 */                return;
                    }
/* 24 */            if (!list.isEmpty()) {
/* 29 */                int size = list.size();
/* 33 */                if (i >= 0 && i < size) {
/* 37 */                    return;
                        }
                    }
/* 54 */            IoOOl0iOl1io.I00111O(IlIi0I0.I00100o1O0lo("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '"), IOOi1I.I0001Ioi1lo(list), "'.");
/* 106 */           throw null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || OII10l11loo.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            OII10l11loo oII10l11loo = (OII10l11loo) obj;
                    return this.I00000oOI == oII10l11loo.I00000oOI && O0000Ioio00.I0000O(this.I00000oIO, oII10l11loo.I00000oIO);
                }

                public final int hashCode() {
/* 11 */            return this.I00000oIO.hashCode() + (this.I00000oOI * 31);
                }

                public final String toString() {
/* 28 */            return "NavigationEventHistory(currentIndex=" + this.I00000oOI + ", mergedHistory=" + this.I00000oIO + ')';
                }

/* 58 */        public OII10l11loo() {
/* 59 */            this(-1, Il01100l.I00iOIl);
                }
            }
