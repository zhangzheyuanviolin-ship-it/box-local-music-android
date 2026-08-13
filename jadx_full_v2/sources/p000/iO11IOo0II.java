            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 18 */    public final class iO11IOo0II implements iO0iIIoO11 {
                public String I00iOIl;
                public ArrayList I00iiI;

                @Override
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
/* 98 */            throw new IllegalStateException("Statement is not an evaluated entity");
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof iO11IOo0II)) {
/* 7 */                 return false;
                    }
/* 11 */            iO11IOo0II io11ioo0ii = (iO11IOo0II) obj;
/* 13 */            String str = this.I00iOIl;
/* 15 */            String str2 = io11ioo0ii.I00iOIl;
/* 17 */            if (str == null ? str2 == null : str.equals(str2)) {
/* 33 */                return this.I00iiI.equals(io11ioo0ii.I00iiI);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.I00iOIl;
/* 19 */            return this.I00iiI.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
                }

                @Override
                public final String zzc() {
/* 20 */            throw new IllegalStateException("Statement cannot be cast as String");
                }

                @Override
                public final Double zzd() {
/* 20 */            throw new IllegalStateException("Statement cannot be cast as Double");
                }

                @Override
                public final Boolean zze() {
/* 20 */            throw new IllegalStateException("Statement cannot be cast as Boolean");
                }

                @Override
                public final Iterator zzf() {
/* 1 */             return null;
                }

                @Override
/* 19 */        public final iO0iIIoO11 zzt() {
/* 20 */            return this;
                }
            }
