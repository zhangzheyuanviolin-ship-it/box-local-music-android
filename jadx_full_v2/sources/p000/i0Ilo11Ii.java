            package p000;

            import android.os.Bundle;
            import com.google.android.play.core.assetpacks.bs;
            import java.util.ArrayList;
            import java.util.HashMap;
            
            public final class i0Ilo11Ii {
                public final long I00000oIO;
                public final HashMap I00000oOI;

                public i0Ilo11Ii(long j, HashMap map) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = map;
                }

                public static i0Ilo11Ii I00000oIO(Bundle bundle, i0O0oOiO11 i0o0ooio11, i0OI1IOoili1 i0oi1iooili1) {
/* 5 */             i1O01Ill i1o01ill = new i1O01Ill(17);
/* 10 */            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
/* 16 */            HashMap map = new HashMap();
/* 19 */            int size = stringArrayList.size();
/* 24 */            for (int i = 0; i < size; i++) {
/* 26 */                String str = stringArrayList.get(i);
/* 36 */                map.put(str, bs.I00000oOI(bundle, str, i0o0ooio11, i0oi1iooili1, i1o01ill));
                    }
/* 50 */            return new i0Ilo11Ii(bundle.getLong("total_bytes_to_download"), map);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof i0Ilo11Ii)) {
/* 30 */                return false;
                    }
/* 8 */             i0Ilo11Ii i0ilo11ii = (i0Ilo11Ii) obj;
                    return this.I00000oIO == i0ilo11ii.I00000oIO && this.I00000oOI.equals(i0ilo11ii.I00000oOI);
                }

                public final int hashCode() {
/* 3 */             long j = this.I00000oIO;
/* 21 */            return this.I00000oOI.hashCode() ^ ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 32 */            return "AssetPackStates{totalBytes=" + this.I00000oIO + ", packStates=" + this.I00000oOI.toString() + "}";
                }
            }
