            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 9 */     public final class iI1II1oO implements iO0iIIoO11 {
                public final iO0iIIoO11 I00iOIl;
                public final String I00iiI;

                public iI1II1oO(String str) {
/* 6 */             this.I00iOIl = iO0iIIoO11.I00Ol1ll1;
/* 8 */             this.I00iiI = str;
                }

                @Override
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
/* 98 */            throw new IllegalStateException("Control does not have functions");
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 31 */                return true;
                    }
/* 6 */             if (!(obj instanceof iI1II1oO)) {
/* 33 */                return false;
                    }
/* 9 */             iI1II1oO ii1ii1oo = (iI1II1oO) obj;
                    return this.I00iiI.equals(ii1ii1oo.I00iiI) && this.I00iOIl.equals(ii1ii1oo.I00iOIl);
                }

                public final int hashCode() {
/* 15 */            return this.I00iOIl.hashCode() + (this.I00iiI.hashCode() * 31);
                }

                @Override
                public final String zzc() {
/* 20 */            throw new IllegalStateException("Control is not a String");
                }

                @Override
                public final Double zzd() {
/* 20 */            throw new IllegalStateException("Control is not a double");
                }

                @Override
                public final Boolean zze() {
/* 20 */            throw new IllegalStateException("Control is not a boolean");
                }

                @Override
                public final Iterator zzf() {
/* 1 */             return null;
                }

                @Override
                public final iO0iIIoO11 zzt() {
/* 11 */            return new iI1II1oO(this.I00iiI, this.I00iOIl.zzt());
                }

/* 10 */        public iI1II1oO(String str, iO0iIIoO11 io0iiioo11) {
                    this.I00iOIl = io0iiioo11;
                    this.I00iiI = str;
                }
            }
