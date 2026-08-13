            package p000;

            import android.os.Bundle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            
            public final class il11o1 implements lIlI1I {
                public io0oIOI1o1i I00000oIO;

                @Override
                public final void I00000oIO(Bundle bundle) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 9 */             io0oioi1o1i.I00000oIO(new ilI001i(io0oioi1o1i, bundle, 1));
                }

                @Override
                public final void I00000oOI(String str) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 9 */             io0oioi1o1i.I00000oIO(new ilO1oIo0o0ii(io0oioi1o1i, str, 1));
                }

                @Override
                public final void I0000Il00O(String str, String str2, Bundle bundle) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 12 */            io0oioi1o1i.I00000oIO(new iliOIiil(io0oioi1o1i, str, str2, bundle, true));
                }

                @Override
                public final void I0000O(String str) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 9 */             io0oioi1o1i.I00000oIO(new ilO1oIo0o0ii(io0oioi1o1i, str, 0));
                }

                @Override
                public final void I0000oI00(String str, String str2, Bundle bundle) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 12 */            io0oioi1o1i.I00000oIO(new ilI11O0l1(io0oioi1o1i, str, str2, bundle, 0));
                }

                @Override
                public final List I0001Ioi1lo(String str, String str2) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 16 */            io0oioi1o1i.I00000oIO(new ilI11O0l1(io0oioi1o1i, str, str2, iioi1o1oo, 1));
/* 31 */            List list = (List) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(5000L), List.class);
                    return list == null ? Collections.EMPTY_LIST : list;
                }

                @Override
                public final int I000II(String str) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 14 */            io0oioi1o1i.I00000oIO(new ilO0olIi(io0oioi1o1i, str, iioi1o1oo, 1));
/* 29 */            Integer num = (Integer) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(10000L), Integer.class);
/* 31 */            if (num == null) {
/* 33 */                return 25;
                    }
/* 36 */            return num.intValue();
                }

                @Override
                public final Map I000O01llI0(String str, String str2, boolean z) {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 16 */            io0oioi1o1i.I00000oIO(new iliOIiil(io0oioi1o1i, str, str2, z, iioi1o1oo));
/* 21 */            Bundle bundleI0000O = iioi1o1oo.I0000O(5000L);
/* 25 */            if (bundleI0000O == null || bundleI0000O.size() == 0) {
/* 84 */                return Collections.EMPTY_MAP;
                    }
/* 40 */            HashMap map = new HashMap(bundleI0000O.size());
/* 55 */            for (String str3 : bundleI0000O.keySet()) {
/* 63 */                Object obj = bundleI0000O.get(str3);
/* 69 */                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
/* 79 */                    map.put(str3, obj);
                        }
                    }
/* 83 */            return map;
                }

                @Override
                public final String zzh() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 15 */            io0oioi1o1i.I00000oIO(new ilOiooOI0iO(io0oioi1o1i, iioi1o1oo, 3, false));
/* 30 */            return (String) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(500L), String.class);
                }

                @Override
                public final String zzi() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 15 */            io0oioi1o1i.I00000oIO(new ilOiooOI0iO(io0oioi1o1i, iioi1o1oo, 4, false));
/* 30 */            return (String) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(500L), String.class);
                }

                @Override
                public final String zzj() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 14 */            io0oioi1o1i.I00000oIO(new ilOiooOI0iO(io0oioi1o1i, iioi1o1oo, 1));
/* 29 */            return (String) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(50L), String.class);
                }

                @Override
                public final String zzk() {
/* 1 */             io0oIOI1o1i io0oioi1o1i = this.I00000oIO;
/* 5 */             iioi1o1OO iioi1o1oo = new iioi1o1OO();
/* 14 */            io0oioi1o1i.I00000oIO(new ilOiooOI0iO(io0oioi1o1i, iioi1o1oo, 0));
/* 29 */            return (String) iioi1o1OO.I0000oI00(iioi1o1oo.I0000O(500L), String.class);
                }

                @Override
                public final long zzl() {
/* 3 */             return this.I00000oIO.I0000O();
                }
            }
