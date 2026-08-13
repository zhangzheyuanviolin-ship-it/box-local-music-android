            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public final class Oii01oOII extends I01IoO {
                public final O0IOli0o0 I00000oIO;
                public final List I00000oOI;
                public final O0ioIllo0i1 I0000Il00O;
                public final Map I0000O;
                public final LinkedHashMap I0000oI00;

                public Oii01oOII(String str, O0IOli0o0 o0IOli0o0, O0IOli0o0[] o0IOli0o0Arr, O0O01001OOII[] o0o01001ooiiArr, Annotation[] annotationArr) {
/* 4 */             this.I00000oIO = o0IOli0o0;
/* 8 */             this.I00000oOI = Il01100l.I00iOIl;
/* 10 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 16 */            O1l110o o1l110o = new O1l110o(16);
/* 19 */            o1l110o.I00iiI = str;
/* 21 */            o1l110o.I00iiO = this;
/* 23 */            VarHandle.storeStoreFence();
/* 30 */            this.I0000Il00O = l0oi0lOi11i.I00000oIO(o0oI01I0oo, o1l110o);
/* 34 */            if (o0IOli0o0Arr.length != o0o01001ooiiArr.length) {
/* 239 */               IoOOl0iOl1io.I000o00OoI0I(o0IOli0o0.I000oI1ioi(), "All subclasses of sealed class ", " should be marked @Serializable");
/* 966 */               throw null;
                    }
/* 40 */            Map mapI000OiO = O1Oii0O0loo.I000OiO(I1IoiO1l.I00Io1lO(o0IOli0o0Arr, o0o01001ooiiArr));
/* 44 */            this.I0000O = mapI000OiO;
/* 46 */            Set<Map.Entry> setEntrySet = mapI000OiO.entrySet();
/* 54 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 65 */            for (Map.Entry entry : setEntrySet) {
/* 83 */                String strI00000oIO = ((O0O01001OOII) entry.getValue()).I0000O().I00000oIO();
/* 87 */                Object obj = linkedHashMap.get(strI00000oIO);
/* 91 */                if (obj == null) {
/* 93 */                    linkedHashMap.containsKey(strI00000oIO);
                        }
/* 96 */                Map.Entry entry2 = (Map.Entry) obj;
/* 98 */                if (entry2 != null) {
/* 110 */                   StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
/* 115 */                   sb.append(this.I00000oIO);
/* 120 */                   sb.append("' have the same serial name '");
/* 123 */                   sb.append(strI00000oIO);
/* 128 */                   sb.append("': '");
/* 135 */                   sb.append(entry2.getKey());
/* 138 */                   Object key = entry.getKey();
/* 144 */                   sb.append("', '");
/* 147 */                   sb.append(key);
/* 152 */                   sb.append('\'');
/* 166 */                   throw new IllegalStateException(sb.toString().toString());
                        }
/* 100 */               linkedHashMap.put(strI00000oIO, entry);
                    }
/* 177 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 194 */           for (Map.Entry entry3 : linkedHashMap.entrySet()) {
/* 218 */               linkedHashMap2.put(entry3.getKey(), (O0O01001OOII) ((Map.Entry) entry3.getValue()).getValue());
                    }
/* 222 */           this.I0000oI00 = linkedHashMap2;
/* 228 */           this.I00000oOI = Arrays.asList(annotationArr);
                }

                @Override
                public final OilOloI I0000O() {
/* 7 */             return (OilOloI) this.I0000Il00O.getValue();
                }

                @Override
                public final O0O01001OOII I0000oI00(IOl1ii1loO iOl1ii1loO, String str) {
/* 7 */             O0O01001OOII o0o01001ooii = (O0O01001OOII) this.I0000oI00.get(str);
/* 9 */             if (o0o01001ooii != null) {
/* 11 */                return o0o01001ooii;
                    }
/* 14 */            super.I0000oI00(iOl1ii1loO, str);
/* 17 */            return null;
                }

                @Override
                public final O0O01001OOII I0001Ioi1lo(Il0I1ii il0I1ii, Object obj) {
                    O0O01001OOII o0o01001ooii;
/* 17 */            O0O01001OOII o0o01001ooii2 = (O0O01001OOII) this.I0000O.get(OOoOl0i.I00000oIO.I00000oOI(obj.getClass()));
/* 20 */            if (o0o01001ooii2 != null) {
/* 22 */                o0o01001ooii = o0o01001ooii2;
                    } else {
/* 25 */                super.I0001Ioi1lo(il0I1ii, obj);
/* 28 */                o0o01001ooii = null;
                    }
/* 29 */            if (o0o01001ooii != null) {
/* 31 */                return o0o01001ooii;
                    }
/* 19 */            return null;
                }

                @Override
                public final O0IOli0o0 I000II() {
/* 1 */             return this.I00000oIO;
                }
            }
