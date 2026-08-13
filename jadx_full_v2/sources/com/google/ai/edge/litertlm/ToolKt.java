            package com.google.ai.edge.litertlm;

            import java.lang.annotation.Annotation;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.regex.Pattern;
            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.IOOi1I;
            import p000.O01l0lO0li;
            import p000.O01l1oO;
            import p000.O0Iill;
            import p000.O1Oii0O0loo;
            import p000.O1OlIoo;
            import p000.O1OlOOioiI;
            import p000.OIoi0IIoi;
            import p000.OOoOl0i;
            import p000.l0IIiOIooI1;
            import p000.lIo0ol0oI010;
            
            @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"tool", "Lcom/google/ai/edge/litertlm/ToolProvider;", "toolSet", "Lcom/google/ai/edge/litertlm/ToolSet;", "openApiTool", "Lcom/google/ai/edge/litertlm/OpenApiTool;", "camelToSnakeCase", "", "snakeToCamelCase", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 2, mv = {2, 3, 0}, xi = 48)
/* 5 */     public final class ToolKt {
                private static final String camelToSnakeCase(String str) {
                    String string;
/* 11 */            int i = 0;
/* 12 */            O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("(?<=[a-zA-Z])[A-Z]").matcher(str), 0, str);
/* 16 */            if (o1OlOOioiII00000oIO == null) {
/* 18 */                string = str.toString();
                    } else {
/* 23 */                int length = str.length();
/* 29 */                StringBuilder sb = new StringBuilder(length);
/* 62 */                do {
/* 38 */                    sb.append((CharSequence) str, i, o1OlOOioiII00000oIO.I00000oOI().I00iOIl);
/* 45 */                    sb.append(camelToSnakeCase$lambda$0(o1OlOOioiII00000oIO));
/* 54 */                    i = o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1;
/* 56 */                    o1OlOOioiII00000oIO = o1OlOOioiII00000oIO.I0000Il00O();
/* 60 */                    if (i >= length) {
                                break;
                            }
/* 62 */                } while (o1OlOOioiII00000oIO != null);
/* 64 */                if (i < length) {
/* 66 */                    sb.append((CharSequence) str, i, length);
                        }
/* 69 */                string = sb.toString();
                    }
/* 75 */            return string.toLowerCase(Locale.ROOT);
                }

                private static final CharSequence camelToSnakeCase$lambda$0(O1OlIoo o1OlIoo) {
/* 11 */            return "_".concat(((O1OlOOioiI) o1OlIoo).I00000oIO.group());
                }

                private static final String snakeToCamelCase(String str) {
/* 11 */            int i = 0;
/* 12 */            O1OlOOioiI o1OlOOioiII00000oIO = lIo0ol0oI010.I00000oIO(Pattern.compile("_([a-z])").matcher(str), 0, str);
/* 16 */            if (o1OlOOioiII00000oIO == null) {
/* 18 */                return str.toString();
                    }
/* 23 */            int length = str.length();
/* 29 */            StringBuilder sb = new StringBuilder(length);
/* 62 */            do {
/* 38 */                sb.append((CharSequence) str, i, o1OlOOioiII00000oIO.I00000oOI().I00iOIl);
/* 45 */                sb.append(snakeToCamelCase$lambda$0(o1OlOOioiII00000oIO));
/* 54 */                i = o1OlOOioiII00000oIO.I00000oOI().I00iiI + 1;
/* 56 */                o1OlOOioiII00000oIO = o1OlOOioiII00000oIO.I0000Il00O();
/* 60 */                if (i >= length) {
                            break;
                        }
/* 62 */            } while (o1OlOOioiII00000oIO != null);
/* 64 */            if (i < length) {
/* 66 */                sb.append((CharSequence) str, i, length);
                    }
/* 69 */            return sb.toString();
                }

                private static final CharSequence snakeToCamelCase$lambda$0(O1OlIoo o1OlIoo) {
/* 16 */            return ((O1OlOOioiI) o1OlIoo).I00000oIO.group().substring(1).toUpperCase(Locale.ROOT);
                }

                public static final ToolProvider tool(final ToolSet toolSet) {
/* 3 */             return new ToolProvider() {
                        @Override
                        public Map<String, InternalJsonTool> mo16xff1c5ada() {
/* 3 */                     boolean convertCamelToSnakeCaseInToolDescription = ExperimentalFlags.INSTANCE.getConvertCamelToSnakeCaseInToolDescription();
/* 19 */                    Collection collectionI001i1lo1io = OOoOl0i.I00000oIO.I00000oOI(toolSet.getClass()).I001i1lo1io();
/* 27 */                    ArrayList arrayList = new ArrayList();
/* 38 */                    for (Object obj : collectionI001i1lo1io) {
/* 46 */                        if (obj instanceof O0Iill) {
/* 48 */                            arrayList.add(obj);
                                }
                            }
/* 54 */                    ArrayList arrayList2 = new ArrayList();
/* 57 */                    Iterator it = arrayList.iterator();
/* 65 */                    while (it.hasNext()) {
/* 67 */                        Object next = it.next();
/* 74 */                        List listI001iOo1i0O = ((O0Iill) next).I001iOo1i0O();
/* 82 */                        if (!(listI001iOo1i0O instanceof Collection) || !listI001iOo1i0O.isEmpty()) {
/* 94 */                            Iterator it2 = listI001iOo1i0O.iterator();
                                    while (true) {
/* 102 */                               if (!it2.hasNext()) {
                                            break;
                                        }
/* 112 */                               if (((Annotation) it2.next()) instanceof Tool) {
/* 114 */                                   arrayList2.add(next);
                                            break;
                                        }
                                    }
                                }
                            }
/* 118 */                   ToolSet toolSet2 = toolSet;
/* 128 */                   ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(arrayList2, 10));
/* 131 */                   Iterator it3 = arrayList2.iterator();
/* 139 */                   while (it3.hasNext()) {
/* 145 */                       O0Iill o0Iill = (O0Iill) it3.next();
/* 147 */                       String name = o0Iill.getName();
/* 151 */                       if (convertCamelToSnakeCaseInToolDescription) {
/* 1 */                             name = ToolKt.camelToSnakeCase(name);
                                }
/* 167 */                       arrayList3.add(new OIoi0IIoi(name, new ReflectionTool(toolSet2, o0Iill, convertCamelToSnakeCaseInToolDescription)));
                            }
/* 171 */                   return O1Oii0O0loo.I000OiO(arrayList3);
                        }
                    };
                }

/* 6 */         public static final ToolProvider tool(final OpenApiTool openApiTool) {
/* 7 */             return new ToolProvider() {
                        @Override
                        public Map<String, InternalJsonTool> mo16xff1c5ada() {
                            try {
/* 11 */                        final O01l0lO0li o01l0lO0liI00000oOI = l0IIiOIooI1.I00000oOI(openApiTool.getToolDescriptionJsonString()).I00000oOI();
                                try {
/* 21 */                            String strI0000O = o01l0lO0liI00000oOI.I000OOo1O("name").I0000O();
/* 27 */                            final OpenApiTool openApiTool2 = openApiTool;
/* 32 */                            return Collections.singletonMap(strI0000O, new InternalJsonTool() {
                                        @Override
                                        public Object execute(O01l0lO0li params) {
/* 7 */                                     return openApiTool2.execute(params.toString());
                                        }

                                        @Override
                                        public O01l0lO0li get$toolDescription() {
/* 1 */                                     return o01l0lO0liI00000oOI;
                                        }
                                    });
                                } catch (Throwable th) {
/* 53 */                            throw new ToolException(IIl001iO0Io.I000o00OoI0I("Failed to parse field \"name\" as String. ", th.getMessage()), th);
                                }
                            } catch (O01l1oO e) {
/* 110 */                       throw new ToolException(IIl001iO0Io.I000o00OoI0I("Failed to parse JSON. ", e.getMessage()), e);
                            }
                        }
                    };
                }
            }
