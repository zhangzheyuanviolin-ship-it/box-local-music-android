            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class iI0io0OI1IOo implements iO0iIIoO11 {
                public final boolean I00iOIl;

                public iI0io0OI1IOo(Boolean bool) {
/* 7 */             this.I00iOIl = bool == null ? false : bool.booleanValue();
                }

                @Override
                public final iO0iIIoO11 I00000oOI(String str, OillOo0 oillOo0, ArrayList arrayList) {
/* 3 */             boolean zEquals = "toString".equals(str);
/* 7 */             boolean z = this.I00iOIl;
/* 9 */             if (zEquals) {
/* 17 */                return new iOO00I0O(Boolean.toString(z));
                    }
/* 33 */            I000II.I000iOII(Oi010OO0.I001IIilI0O(Boolean.toString(z), ".", str, " is not a function."));
/* 36 */            return null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof iI0io0OI1IOo) && this.I00iOIl == ((iI0io0OI1IOo) obj).I00iOIl;
                }

                public final int hashCode() {
/* 7 */             return Boolean.valueOf(this.I00iOIl).hashCode();
                }

                public final String toString() {
/* 3 */             return String.valueOf(this.I00iOIl);
                }

                @Override
                public final String zzc() {
/* 3 */             return Boolean.toString(this.I00iOIl);
                }

                @Override
                public final Double zzd() {
/* 11 */            return Double.valueOf(true != this.I00iOIl ? 0.0d : 1.0d);
                }

                @Override
                public final Boolean zze() {
/* 3 */             return Boolean.valueOf(this.I00iOIl);
                }

                @Override
                public final Iterator zzf() {
/* 1 */             return null;
                }

                @Override
                public final iO0iIIoO11 zzt() {
/* 9 */             return new iI0io0OI1IOo(Boolean.valueOf(this.I00iOIl));
                }
            }
