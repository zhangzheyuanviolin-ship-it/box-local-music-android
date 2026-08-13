            package p000;
            
            public final class li0011I1O {
                public final lOio0i0 I00000oIO;
                public final IIOOoI I00000oOI;

                public li0011I1O(lOio0i0 loio0i0, IIOOoI iIOOoI) {
/* 4 */             this.I00000oIO = loio0i0;
/* 6 */             this.I00000oOI = iIOOoI;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof li0011I1O) {
/* 10 */                li0011I1O li0011i1o = (li0011I1O) obj;
/* 12 */                lOio0i0 loio0i0 = li0011i1o.I00000oIO;
/* 14 */                lOio0i0 loio0i02 = this.I00000oIO;
/* 16 */                if (loio0i02 != null ? loio0i02 == loio0i0 : loio0i0 == null) {
                            return this.I00000oOI == li0011i1o.I00000oOI;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             lOio0i0 loio0i0 = this.I00000oIO;
/* 22 */            return this.I00000oOI.hashCode() ^ (((loio0i0 == null ? 0 : loio0i0.hashCode()) ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.I00000oIO);
/* 9 */             String string = this.I00000oOI.toString();
/* 28 */            StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
/* 35 */            IIl001iO0Io.I001lIiIIo1O(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
/* 40 */            sb.append("}");
/* 43 */            return sb.toString();
                }
            }
