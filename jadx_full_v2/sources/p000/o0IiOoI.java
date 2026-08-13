            package p000;

            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.Callable;
            
            public final class o0IiOoI extends iIIoIiOoOoiO {
                public i1Il01 I00iiO;
                public HashMap I00iio;

                @Override
                public final iO0iIIoO11 I00000oIO(OillOo0 oillOo0, List list) {
                    iO0iIIoO11 io0iiioo11;
/* 4 */             ll00I0ii.I00000oIO("require", 1, list);
/* 22 */            String strZzc = ((OoOlO1O0o) oillOo0.I00iiO).I000OiO(oillOo0, (iO0iIIoO11) list.get(0)).zzc();
/* 26 */            HashMap map = this.I00iio;
/* 32 */            if (map.containsKey(strZzc)) {
/* 38 */                return (iO0iIIoO11) map.get(strZzc);
                    }
/* 45 */            HashMap map2 = (HashMap) this.I00iiO.I00iiI;
/* 51 */            if (map2.containsKey(strZzc)) {
                        try {
/* 63 */                    io0iiioo11 = (iO0iIIoO11) ((Callable) map2.get(strZzc)).call();
                        } catch (Exception unused) {
/* 76 */                    I000II.I001IO000("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
/* 79 */                    return null;
                        }
                    } else {
/* 81 */                io0iiioo11 = iO0iIIoO11.I00Ol1ll1;
                    }
/* 85 */            if (io0iiioo11 instanceof iIIoIiOoOoiO) {
/* 90 */                map.put(strZzc, (iIIoIiOoOoiO) io0iiioo11);
                    }
/* 106 */           return io0iiioo11;
                }
            }
