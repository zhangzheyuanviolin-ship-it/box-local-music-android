            package p000;

            import android.util.Log;
            import com.google.mlkit.genai.schema.guided.GenerableDetail;
            import com.google.mlkit.genai.schema.guided.GenerableProvider;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class i1O11ii1 {
                public static final I1ii1o0 I00000oIO;

                static {
/* 3 */             ll1lol0i ll1lol0iVar = ll1lol0i.I000OOo1O;
/* 8 */             I1ii1o0 i1ii1o0 = new I1ii1o0(22, false);
/* 16 */            i1ii1o0.I00iiI = new ThreadLocal();
/* 23 */            i1ii1o0.I00iiO = new ConcurrentHashMap();
/* 25 */            lloI11II0o0 lloi11ii0o0 = ll1lol0iVar.I00000oIO;
/* 31 */            new HashMap(ll1lol0iVar.I00000oOI);
/* 36 */            ll1lol0i.I00000oIO(ll1lol0iVar.I0000Il00O);
/* 41 */            ll1lol0i.I00000oIO(ll1lol0iVar.I0000O);
/* 46 */            ll1lol0i.I00000oIO(ll1lol0iVar.I0000oI00);
/* 51 */            i1ii1o0.I00iio = ll1lol0i.I000II;
/* 55 */            i1ii1o0.I00ilI0I1 = ll1lol0i.I000O01llI0;
/* 59 */            i1ii1o0.I00ilO0 = ll1lol0i.I000OiO;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            I00000oIO = i1ii1o0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
                
                    if (r0.I0001Ioi1lo().length() == 1) goto L23;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I00000oIO(llII0l1O1l1 llii0l1o1l1, O0IOli0o0 o0IOli0o0, boolean z, GenerableDetail.GuideDetail guideDetail) {
                    boolean zI00000oIO;
/* 7 */             if (llii0l1o1l1 instanceof llIi1IlOl) {
/* 9 */                 return z;
                    }
/* 23 */            if (guideDetail != null && guideDetail.isList()) {
/* 33 */                if (!(llii0l1o1l1 instanceof llI001IilOi)) {
/* 35 */                    String name = guideDetail.getName();
/* 60 */                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 41 + String.valueOf(llii0l1o1l1).length());
/* 63 */                    sb.append("Expected JsonArray for field '");
/* 66 */                    sb.append(name);
/* 69 */                    sb.append("', but got ");
/* 72 */                    sb.append(llii0l1o1l1);
/* 79 */                    Log.e("TypedResponseHelper", sb.toString());
/* 22 */                    return false;
                        }
/* 83 */                O0IOli0o0 listItemType = guideDetail.getListItemType();
/* 87 */                if (listItemType != null) {
/* 131 */                   Iterator it = llii0l1o1l1.I0000O().I00iOIl.iterator();
/* 139 */                   while (it.hasNext()) {
/* 151 */                       if (!I00000oIO((llII0l1O1l1) it.next(), listItemType, false, null)) {
/* 22 */                            return false;
                                }
                            }
/* 21 */                    return true;
                        }
/* 89 */                String name2 = guideDetail.getName();
/* 105 */               StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 45);
/* 108 */               sb2.append("Could not determine list element type for '");
/* 111 */               sb2.append(name2);
/* 114 */               sb2.append("'.");
/* 121 */               Log.e("TypedResponseHelper", sb2.toString());
/* 22 */                return false;
                    }
/* 163 */           if (llii0l1o1l1 instanceof llIoiI) {
/* 165 */               llIoiI llioii = (llIoiI) llii0l1o1l1;
/* 167 */               Serializable serializable = llioii.I00iOIl;
/* 169 */               OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 181 */               if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Boolean.TYPE))) {
/* 183 */                   return serializable instanceof Boolean;
                        }
/* 196 */               if (!O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Character.TYPE))) {
/* 223 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Byte.TYPE))) {
/* 225 */                       return serializable instanceof Number;
                            }
/* 238 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Short.TYPE))) {
/* 240 */                       return serializable instanceof Number;
                            }
/* 253 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Integer.TYPE))) {
/* 255 */                       return serializable instanceof Number;
                            }
/* 268 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Long.TYPE))) {
/* 270 */                       return serializable instanceof Number;
                            }
/* 283 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Float.TYPE))) {
/* 285 */                       return serializable instanceof Number;
                            }
/* 298 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(Double.TYPE))) {
/* 300 */                       return serializable instanceof Number;
                            }
/* 313 */                   if (O0000Ioio00.I0000O(o0IOli0o0, oOoOl1001II.I00000oOI(String.class))) {
/* 315 */                       return serializable instanceof String;
                            }
/* 332 */                   Log.e("TypedResponseHelper", "Unsupported primitive type for validation: ".concat(String.valueOf(o0IOli0o0.I000oI1ioi())));
/* 22 */                    return false;
                        }
/* 200 */               if (serializable instanceof String) {
                        }
                    } else if (llii0l1o1l1 instanceof llIiii10) {
/* 346 */               lo0olliO11 lo0ollio11 = llii0l1o1l1.I00000oOI().I00iOIl;
/* 360 */               GenerableProvider generableProvider = (GenerableProvider) ((Map) o0oiiO1o.I00000oIO.getValue()).get(o0IOli0o0);
/* 376 */               if (generableProvider != null) {
/* 936 */                   List<GenerableDetail.GuideDetail> guideDetails = generableProvider.getGenerableDetail().getGuideDetails();
/* 941 */                   List<GenerableDetail.GuideDetail> list = guideDetails;
/* 949 */                   int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(list, 10));
/* 959 */                   LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO >= 16 ? iI00000oIO : 16);
/* 970 */                   for (Object obj : list) {
/* 983 */                       linkedHashMap.put(((GenerableDetail.GuideDetail) obj).getName(), obj);
                            }
/* 993 */                   Iterator it2 = ((lo0IO0l1I) lo0ollio11.keySet()).iterator();
/* 1004 */                  while (((O100iii0I0i) it2).hasNext()) {
/* 1015 */                      String str = (String) ((lo01Olli) it2).I00000oOI().I00iiI;
/* 1021 */                      if (!linkedHashMap.containsKey(str)) {
/* 1023 */                          String strI000oI1ioi = o0IOli0o0.I000oI1ioi();
/* 1050 */                          StringBuilder sb3 = new StringBuilder(String.valueOf(strI000oI1ioi).length() + String.valueOf(str).length() + 42 + 1);
/* 1053 */                          sb3.append("Unknown field '");
/* 1056 */                          sb3.append(str);
/* 1059 */                          sb3.append("' found in JSON object for ");
/* 1062 */                          sb3.append(strI000oI1ioi);
/* 1065 */                          sb3.append(".");
/* 1072 */                          Log.e("TypedResponseHelper", sb3.toString());
/* 1075 */                          return false;
                                }
                            }
/* 1086 */                  for (GenerableDetail.GuideDetail guideDetail2 : guideDetails) {
/* 1094 */                      String name3 = guideDetail2.getName();
/* 1102 */                      if (!lo0ollio11.containsKey(name3)) {
/* 1104 */                          String strI000oI1ioi2 = o0IOli0o0.I000oI1ioi();
/* 1131 */                          StringBuilder sb4 = new StringBuilder(String.valueOf(strI000oI1ioi2).length() + String.valueOf(name3).length() + 29 + 1);
/* 1134 */                          sb4.append("Missing field '");
/* 1137 */                          sb4.append(name3);
/* 1140 */                          sb4.append("' in JSON for ");
/* 1143 */                          sb4.append(strI000oI1ioi2);
/* 1146 */                          sb4.append(".");
/* 1153 */                          Log.e("TypedResponseHelper", sb4.toString());
/* 1156 */                          return false;
                                }
/* 1179 */                      if (!I00000oIO((llII0l1O1l1) lo0ollio11.get(name3), guideDetail2.getType(), guideDetail2.getNullable(), guideDetail2)) {
/* 1159 */                          return false;
                                }
                            }
/* 21 */                    return true;
                        }
/* 378 */               String strI000oI1ioi3 = o0IOli0o0.I000oI1ioi();
/* 390 */               boolean z2 = false;
/* 396 */               StringBuilder sb5 = new StringBuilder(String.valueOf(strI000oI1ioi3).length() + 50);
/* 401 */               sb5.append("No GenerableProvider found for ");
/* 404 */               sb5.append(strI000oI1ioi3);
/* 409 */               sb5.append(", using reflection.");
/* 416 */               Log.i("TypedResponseHelper", sb5.toString());
/* 423 */               lo0olliO11 lo0ollio112 = llii0l1o1l1.I00000oOI().I00iOIl;
/* 432 */               Field[] declaredFields = ((IOIO10iOi1) o0IOli0o0).I001l0I00().getDeclaredFields();
/* 437 */               int iI00000oIO2 = O1Oii0o0Oi.I00000oIO(declaredFields.length);
/* 447 */               LinkedHashMap linkedHashMap2 = new LinkedHashMap(iI00000oIO2 >= 16 ? iI00000oIO2 : 16);
/* 452 */               for (Field field : declaredFields) {
/* 462 */                   linkedHashMap2.put(field.getName(), field);
                        }
/* 476 */               Iterator it3 = ((lo0IO0l1I) lo0ollio112.keySet()).iterator();
/* 487 */               while (((O100iii0I0i) it3).hasNext()) {
/* 498 */                   String str2 = (String) ((lo01Olli) it3).I00000oOI().I00iiI;
/* 504 */                   if (!linkedHashMap2.containsKey(str2)) {
/* 506 */                       String strI000oI1ioi4 = o0IOli0o0.I000oI1ioi();
/* 533 */                       StringBuilder sb6 = new StringBuilder(String.valueOf(strI000oI1ioi4).length() + String.valueOf(str2).length() + 42 + 1);
/* 536 */                       sb6.append("Unknown field '");
/* 539 */                       sb6.append(str2);
/* 542 */                       sb6.append("' found in JSON object for ");
/* 545 */                       sb6.append(strI000oI1ioi4);
/* 548 */                       sb6.append(".");
/* 555 */                       Log.e("TypedResponseHelper", sb6.toString());
/* 390 */                       return false;
                            }
                        }
/* 571 */               for (Map.Entry entry : linkedHashMap2.entrySet()) {
/* 583 */                   String str3 = (String) entry.getKey();
/* 589 */                   Field field2 = (Field) entry.getValue();
/* 595 */                   if (!lo0ollio112.containsKey(str3)) {
/* 597 */                       String strI000oI1ioi5 = o0IOli0o0.I000oI1ioi();
/* 620 */                       StringBuilder sb7 = new StringBuilder(String.valueOf(strI000oI1ioi5).length() + str3.length() + 29 + 1);
/* 623 */                       sb7.append("Missing field '");
/* 626 */                       sb7.append(str3);
/* 629 */                       sb7.append("' in JSON for ");
/* 632 */                       sb7.append(strI000oI1ioi5);
/* 635 */                       sb7.append(".");
/* 642 */                       Log.e("TypedResponseHelper", sb7.toString());
/* 645 */                       return z2;
                            }
/* 650 */                   llII0l1O1l1 llii0l1o1l12 = (llII0l1O1l1) lo0ollio112.get(str3);
/* 652 */                   Type genericType = field2.getGenericType();
/* 658 */                   if (!(genericType instanceof Class)) {
/* 681 */                       if (genericType instanceof ParameterizedType) {
/* 683 */                           ParameterizedType parameterizedType = (ParameterizedType) genericType;
/* 685 */                           Type rawType = parameterizedType.getRawType();
/* 696 */                           Class cls = rawType instanceof Class ? (Class) rawType : null;
/* 697 */                           if (cls == null || !List.class.isAssignableFrom(cls)) {
/* 857 */                               StringBuilder sb8 = new StringBuilder(str3.length() + 45 + String.valueOf(parameterizedType).length());
/* 862 */                               sb8.append("Unsupported parameterized type for field '");
/* 865 */                               sb8.append(str3);
/* 868 */                               sb8.append("': ");
/* 871 */                               sb8.append(parameterizedType);
/* 878 */                               Log.e("TypedResponseHelper", sb8.toString());
                                    } else {
/* 713 */                               Type type = parameterizedType.getActualTypeArguments()[0];
/* 722 */                               Class cls2 = type instanceof Class ? (Class) type : null;
/* 723 */                               if (cls2 == null) {
/* 733 */                                   StringBuilder sb9 = new StringBuilder(str3.length() + 45);
/* 736 */                                   sb9.append("Could not determine list element type for '");
/* 739 */                                   sb9.append(str3);
/* 742 */                                   sb9.append("'.");
/* 749 */                                   Log.e("TypedResponseHelper", sb9.toString());
                                        } else if (llii0l1o1l12 instanceof llI001IilOi) {
/* 805 */                                   Iterator it4 = llii0l1o1l12.I0000O().I00iOIl.iterator();
/* 813 */                                   while (it4.hasNext()) {
/* 833 */                                       if (!I00000oIO((llII0l1O1l1) it4.next(), OOoOl0i.I00000oIO.I00000oOI(cls2), false, null)) {
                                                }
                                            }
/* 836 */                                   zI00000oIO = true;
                                        } else {
/* 776 */                                   StringBuilder sb10 = new StringBuilder(str3.length() + 41 + String.valueOf(llii0l1o1l12).length());
/* 779 */                                   sb10.append("Expected JsonArray for field '");
/* 782 */                                   sb10.append(str3);
/* 785 */                                   sb10.append("', but got ");
/* 788 */                                   sb10.append(llii0l1o1l12);
/* 795 */                                   Log.e("TypedResponseHelper", sb10.toString());
                                        }
                                    }
                                } else {
/* 900 */                           StringBuilder sb11 = new StringBuilder(str3.length() + 31 + String.valueOf(genericType).length());
/* 905 */                           sb11.append("Unsupported type for field '");
/* 908 */                           sb11.append(str3);
/* 911 */                           sb11.append("': ");
/* 914 */                           sb11.append(genericType);
/* 921 */                           Log.e("TypedResponseHelper", sb11.toString());
                                }
/* 752 */                       zI00000oIO = false;
                                break;
                            }
/* 671 */                   zI00000oIO = I00000oIO(llii0l1o1l12, OOoOl0i.I00000oIO.I00000oOI((Class) genericType), z2, null);
/* 926 */                   z2 = false;
/* 928 */                   if (!zI00000oIO) {
/* 926 */                       return false;
                            }
                        }
/* 21 */                return true;
                    }
/* 22 */            return false;
                }
            }
