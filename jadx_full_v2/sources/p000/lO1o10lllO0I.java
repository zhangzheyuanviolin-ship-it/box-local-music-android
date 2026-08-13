            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lO1o10lllO0I {
                public static final OOIii1ili I00000oIO(String str) {
/* 1 */             OOIOoio0iiI oOIOoio0iiI = OOIOoio0iiI.I000OiO;
/* 8 */             if (OlOoOIi0o.I001l0I00(str)) {
/* 105 */               I000II.I000iOII("Blank serial names are prohibited");
/* 7 */                 return null;
                    }
/* 18 */            Object it = ((IO0ioo1i0oo) OOIio001.I00000oIO.values()).iterator();
/* 29 */            while (((OlloI01I) it).hasNext()) {
/* 38 */                O0O01001OOII o0o01001ooii = (O0O01001OOII) ((O1OIoioOO1lo) it).next();
/* 52 */                if (str.equals(o0o01001ooii.I0000O().I00000oIO())) {
/* 59 */                    StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
/* 77 */                    sbI001IIilI0O.append(OOoOl0i.I00000oIO.I00000oOI(o0o01001ooii.getClass()).I000oI1ioi());
/* 82 */                    sbI001IIilI0O.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
/* 93 */                    I000II.I000iOII(OlOoOOooiIll.I0000Il00O(sbI001IIilI0O.toString()));
/* 7 */                     return null;
                        }
                    }
/* 99 */            return new OOIii1ili(str, oOIOoio0iiI);
                }

                public static final OilOoi I00000oOI(String str, lO1oIl1ii lo1oil1ii, OilOloI[] oilOloIArr, Function1 function1) {
/* 6 */             if (OlOoOIi0o.I001l0I00(str)) {
/* 280 */               I000II.I000iOII("Blank serial names are prohibited");
/* 5 */                 return null;
                    }
/* 14 */            if (lo1oil1ii.equals(Oli00oo0l.I00000oOI)) {
/* 274 */               I000II.I000iOII("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
/* 5 */                 return null;
                    }
/* 18 */            IOIi0iI010o iOIi0iI010o = new IOIi0iI010o();
/* 21 */            iOIi0iI010o.I00000oIO = str;
/* 25 */            iOIi0iI010o.I00000oOI = Il01100l.I00iOIl;
/* 29 */            ArrayList arrayList = new ArrayList();
/* 32 */            iOIi0iI010o.I0000Il00O = arrayList;
/* 39 */            iOIi0iI010o.I0000O = new HashSet();
/* 43 */            ArrayList arrayList2 = new ArrayList();
/* 46 */            iOIi0iI010o.I0000oI00 = arrayList2;
/* 50 */            ArrayList arrayList3 = new ArrayList();
/* 53 */            iOIi0iI010o.I0001Ioi1lo = arrayList3;
/* 57 */            ArrayList arrayList4 = new ArrayList();
/* 60 */            iOIi0iI010o.I000II = arrayList4;
/* 62 */            VarHandle.storeStoreFence();
/* 65 */            function1.invoke(iOIi0iI010o);
/* 70 */            int size = arrayList.size();
/* 74 */            List listI00IioO0OiOi = I1IoiO1l.I00IioO0OiOi(oilOloIArr);
/* 78 */            OilOoi oilOoi = new OilOoi();
/* 81 */            oilOoi.I00000oIO = str;
/* 83 */            oilOoi.I00000oOI = lo1oil1ii;
/* 85 */            oilOoi.I0000Il00O = size;
/* 89 */            oilOoi.I0000O = iOIi0iI010o.I00000oOI;
/* 103 */           HashSet hashSet = new HashSet(O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(arrayList, 12)));
/* 106 */           IOOi0Ool1i.I00i0ilIl0i(arrayList, hashSet);
/* 109 */           oilOoi.I0000oI00 = hashSet;
/* 111 */           int i = 0;
/* 118 */           String[] strArr = (String[]) arrayList.toArray(new String[0]);
/* 120 */           oilOoi.I0001Ioi1lo = strArr;
/* 126 */           oilOoi.I000II = iO0IO0O.I00000oOI(arrayList2);
/* 136 */           oilOoi.I000O01llI0 = (List[]) arrayList3.toArray(new List[0]);
/* 142 */           boolean[] zArr = new boolean[arrayList4.size()];
/* 144 */           Iterator it = arrayList4.iterator();
/* 152 */           while (it.hasNext()) {
/* 166 */               zArr[i] = ((Boolean) it.next()).booleanValue();
/* 164 */               i++;
                    }
/* 170 */           oilOoi.I000OOo1O = zArr;
/* 177 */           I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(6);
/* 180 */           i0OIOO00l0O.I00iiI = strArr;
/* 182 */           VarHandle.storeStoreFence();
/* 185 */           I1IollOi01 i1IollOi01 = new I1IollOi01(i0OIOO00l0O);
/* 196 */           ArrayList arrayList5 = new ArrayList(IOOi1I.I0000O(i1IollOi01, 10));
/* 199 */           Iterator it2 = i1IollOi01.iterator();
                    while (true) {
/* 204 */               Iio0IIOo iio0IIOo = (Iio0IIOo) it2;
/* 212 */               if (!iio0IIOo.I00iiI.hasNext()) {
/* 241 */                   oilOoi.I000OiO = O1Oii0O0loo.I000OiO(arrayList5);
/* 247 */                   oilOoi.I000iOII = iO0IO0O.I00000oOI(listI00IioO0OiOi);
/* 253 */                   OIOo1iiI oIOo1iiI = new OIOo1iiI(26);
/* 256 */                   oIOo1iiI.I00iiI = oilOoi;
/* 258 */                   VarHandle.storeStoreFence();
/* 266 */                   oilOoi.I000l1 = new OllO00oiil(oIOo1iiI);
/* 268 */                   VarHandle.storeStoreFence();
/* 271 */                   return oilOoi;
                        }
/* 218 */               Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 233 */               arrayList5.add(new OIoi0IIoi(iol0oIiIOI.I00000oOI, Integer.valueOf(iol0oIiIOI.I00000oIO)));
                    }
                }
            }
