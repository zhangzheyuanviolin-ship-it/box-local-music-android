            package com.google.ai.edge.litertlm;

            import java.io.IOException;
            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IOOi0Ool1i;
            import p000.IOOi1I;
            import p000.IiO1l1i;
            import p000.O0000Ioio00;
            import p000.O01I0il01001;
            import p000.O01O10Ii;
            import p000.O01iIOolI;
            import p000.O01l0lO0li;
            import p000.O01li1IO;
            import p000.O0IOli0o0;
            import p000.O0IiIl0il;
            import p000.O0Iill;
            import p000.O0IooIIl00;
            import p000.O0O01O0o;
            import p000.O0O0o1io;
            import p000.O1Oii0O0loo;
            import p000.O1Oii0o0Oi;
            import p000.OIoi0IIoi;
            import p000.OOii01Ioi1;
            import p000.OOoOl0i;
            import p000.OOoOl1001II;
            
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/google/ai/edge/litertlm/ReflectionTool;", "Lcom/google/ai/edge/litertlm/InternalJsonTool;", "", "instance", "LO0Iill;", "kFunction", "", "useSnakeCase", "<init>", "(Ljava/lang/Object;LO0Iill;Z)V", "LO01O10Ii;", "value", "LO0O01O0o;", "type", "convertJsonValueToKotlinValue", "(LO01O10Ii;LO0O01O0o;)Ljava/lang/Object;", "LO01l0lO0li;", "getTypeJsonSchema", "(LO0O01O0o;)LO01l0lO0li;", "LO0IooIIl00;", "", "toModelParamName", "(LO0IooIIl00;)Ljava/lang/String;", "getToolDescription", "()LO01l0lO0li;", "params", "execute", "(LO01l0lO0li;)Ljava/lang/Object;", "Ljava/lang/Object;", "getInstance", "()Ljava/lang/Object;", "LO0Iill;", "getKFunction", "()LO0Iill;", "Z", "getUseSnakeCase", "()Z", "Companion", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ReflectionTool implements InternalJsonTool {
                private static final Map<O0IOli0o0, String> javaTypeToJsonTypeString;
                private final Object instance;
                private final O0Iill kFunction;
                private final boolean useSnakeCase;

                static {
/* 9 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 96 */            javaTypeToJsonTypeString = O1Oii0O0loo.I0000O(new OIoi0IIoi(oOoOl1001II.I00000oOI(String.class), "string"), new OIoi0IIoi(oOoOl1001II.I00000oOI(Integer.TYPE), "integer"), new OIoi0IIoi(oOoOl1001II.I00000oOI(Boolean.TYPE), "boolean"), new OIoi0IIoi(oOoOl1001II.I00000oOI(Float.TYPE), "number"), new OIoi0IIoi(oOoOl1001II.I00000oOI(Double.TYPE), "number"), new OIoi0IIoi(oOoOl1001II.I00000oOI(List.class), "array"));
                }

                public ReflectionTool(Object obj, O0Iill o0Iill, boolean z) {
/* 4 */             this.instance = obj;
/* 6 */             this.kFunction = o0Iill;
/* 8 */             this.useSnakeCase = z;
                }

                /* JADX WARN: Multi-variable type inference failed */
                private final Object convertJsonValueToKotlinValue(O01O10Ii value, O0O01O0o type) {
/* 1 */             O0IiIl0il o0IiIl0ilI001IIilI0O = type.I001IIilI0O();
/* 5 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 17 */            if (O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, oOoOl1001II.I00000oOI(List.class)) && (value instanceof O01I0il01001)) {
/* 31 */                O0O0o1io o0O0o1io = (O0O0o1io) IOOi0Ool1i.I00II0Ol1O0l(type.I00111O());
/* 38 */                O0O01O0o o0O01O0o = o0O0o1io != null ? o0O0o1io.I00000oOI : null;
/* 39 */                Iterable iterable = (Iterable) value;
/* 49 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iterable, 10));
/* 52 */                Iterator it = iterable.iterator();
/* 60 */                while (it.hasNext()) {
/* 72 */                    arrayList.add(convertJsonValueToKotlinValue((O01O10Ii) it.next(), o0O01O0o));
                        }
/* 76 */                return arrayList;
                    }
/* 89 */            if (O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, oOoOl1001II.I00000oOI(Integer.TYPE)) && (value instanceof O01li1IO)) {
/* 96 */                O01li1IO o01li1IO = (O01li1IO) value;
/* 102 */               if (o01li1IO.I00iOIl instanceof Number) {
/* 112 */                   return Integer.valueOf(o01li1IO.I000OiO().intValue());
                        }
                    }
/* 128 */           if (O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, oOoOl1001II.I00000oOI(Float.TYPE)) && (value instanceof O01li1IO)) {
/* 135 */               O01li1IO o01li1IO2 = (O01li1IO) value;
/* 141 */               if (o01li1IO2.I00iOIl instanceof Number) {
/* 151 */                   return Float.valueOf(o01li1IO2.I000OiO().floatValue());
                        }
                    }
/* 166 */           if (O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, oOoOl1001II.I00000oOI(Double.TYPE)) && (value instanceof O01li1IO)) {
/* 173 */               O01li1IO o01li1IO3 = (O01li1IO) value;
/* 179 */               if (o01li1IO3.I00iOIl instanceof Number) {
/* 185 */                   return Double.valueOf(o01li1IO3.I000OOo1O());
                        }
                    }
/* 200 */           if (O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, oOoOl1001II.I00000oOI(String.class)) && (value instanceof O01li1IO)) {
/* 207 */               O01li1IO o01li1IO4 = (O01li1IO) value;
/* 213 */               if (o01li1IO4.I00iOIl instanceof String) {
/* 215 */                   return o01li1IO4.I0000O();
                        }
                    }
/* 230 */           if (!O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, oOoOl1001II.I00000oOI(Boolean.TYPE)) || !(value instanceof O01li1IO)) {
/* 332 */               return value;
                    }
/* 237 */           O01li1IO o01li1IO5 = (O01li1IO) value;
                    return o01li1IO5.I00iOIl instanceof Boolean ? Boolean.valueOf(o01li1IO5.I0001Ioi1lo()) : value;
                }

                private final O01l0lO0li getTypeJsonSchema(O0O01O0o type) throws IOException {
/* 1 */             O0IiIl0il o0IiIl0ilI001IIilI0O = type.I001IIilI0O();
/* 5 */             Map<O0IOli0o0, String> map = javaTypeToJsonTypeString;
/* 7 */             String str = map.get(o0IiIl0ilI001IIilI0O);
/* 13 */            if (str == null) {
/* 168 */               throw new IllegalArgumentException("Unsupported type: " + o0IiIl0ilI001IIilI0O + ". Allowed types are: " + IOOi0Ool1i.I00IlilI0i0i(map.keySet(), null, null, null, new OOii01Ioi1(7), 31));
                    }
/* 17 */            O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 22 */            o01l0lO0li.I0001Ioi1lo("type", str);
/* 37 */            if (!O0000Ioio00.I0000O(o0IiIl0ilI001IIilI0O, OOoOl0i.I00000oIO.I00000oOI(List.class))) {
/* 74 */                return o01l0lO0li;
                    }
/* 47 */            O0O0o1io o0O0o1io = (O0O0o1io) IOOi0Ool1i.I00II0Ol1O0l(type.I00111O());
/* 55 */            O0O01O0o o0O01O0o = o0O0o1io != null ? o0O0o1io.I00000oOI : null;
/* 56 */            if (o0O01O0o != null) {
/* 64 */                o01l0lO0li.I0000oI00("items", getTypeJsonSchema(o0O01O0o));
/* 67 */                return o01l0lO0li;
                    }
/* 70 */            I000II.I000iOII("List type argument is missing.");
/* 49 */            return null;
                }

                private static final CharSequence getTypeJsonSchema$lambda$0(O0IOli0o0 o0IOli0o0) {
/* 1 */             String strI000oI1ioi = o0IOli0o0.I000oI1ioi();
                    return strI000oI1ioi != null ? strI000oI1ioi : "";
                }

                private final String toModelParamName(O0IooIIl00 o0IooIIl00) {
/* 3 */             IiO1l1i iiO1l1i = (IiO1l1i) o0IooIIl00;
                    return this.useSnakeCase ? ToolKt.camelToSnakeCase(iiO1l1i.getName()) : iiO1l1i.getName();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object execute(O01l0lO0li params) {
                    Object objConvertJsonValueToKotlinValue;
/* 3 */             List listI000II = this.kFunction.I000II();
/* 17 */            int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(listI000II, 10));
/* 23 */            if (iI00000oIO < 16) {
/* 25 */                iI00000oIO = 16;
                    }
/* 26 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 37 */            for (Object obj : listI000II) {
/* 44 */                O0IooIIl00 o0IooIIl00 = (O0IooIIl00) obj;
/* 51 */                if (((IiO1l1i) o0IooIIl00).I00iiI == 0) {
/* 53 */                    objConvertJsonValueToKotlinValue = this.instance;
                        } else {
/* 57 */                    IiO1l1i iiO1l1i = (IiO1l1i) o0IooIIl00;
/* 63 */                    if (iiO1l1i.getName() != null) {
/* 75 */                        if (params.I00iOIl.containsKey(toModelParamName(o0IooIIl00))) {
/* 89 */                            objConvertJsonValueToKotlinValue = convertJsonValueToKotlinValue(params.I000OOo1O(toModelParamName(o0IooIIl00)), iiO1l1i.I000l1());
                                } else {
/* 99 */                            if (!iiO1l1i.I00100o1O0lo()) {
/* 116 */                               I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Missing parameter: ", toModelParamName(o0IooIIl00)));
/* 98 */                                return null;
                                    }
/* 101 */                           objConvertJsonValueToKotlinValue = null;
                                }
                            }
                        }
/* 102 */               linkedHashMap.put(obj, objConvertJsonValueToKotlinValue);
                    }
/* 122 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 137 */           for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 149 */               if (entry.getValue() != null) {
/* 159 */                   linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 165 */           return this.kFunction.I000OOo1O(linkedHashMap2);
                }

                public final Object getInstance() {
/* 1 */             return this.instance;
                }

                public final O0Iill getKFunction() {
/* 1 */             return this.kFunction;
                }

                @Override
                public O01l0lO0li get$toolDescription() throws IOException {
                    Object next;
                    ArrayList arrayList;
                    Object obj;
                    Object next2;
                    String strDescription;
/* 9 */             Iterator it = this.kFunction.I001iOo1i0O().iterator();
                    while (true) {
/* 18 */                if (!it.hasNext()) {
/* 32 */                    next = null;
                            break;
                        }
/* 20 */                next = it.next();
/* 29 */                if (((Annotation) next) instanceof Tool) {
                            break;
                        }
                    }
/* 40 */            Tool tool = next instanceof Tool ? (Tool) next : null;
/* 41 */            if (tool == null) {
/* 45 */                return new O01l0lO0li();
                    }
/* 49 */            String strDescription2 = tool.description();
/* 55 */            O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 58 */            boolean z = this.useSnakeCase;
/* 60 */            O0Iill o0Iill = this.kFunction;
/* 79 */            o01l0lO0li.I0001Ioi1lo("name", z ? ToolKt.camelToSnakeCase(o0Iill.getName()) : o0Iill.getName());
/* 84 */            o01l0lO0li.I0001Ioi1lo("description", strDescription2);
/* 96 */            List listI001iOo1i0O = IOOi0Ool1i.I001iOo1i0O(this.kFunction.I000II(), 1);
/* 104 */           if (!listI001iOo1i0O.isEmpty()) {
/* 108 */               O01l0lO0li o01l0lO0li2 = new O01l0lO0li();
/* 111 */               Iterator it2 = listI001iOo1i0O.iterator();
/* 119 */               while (it2.hasNext()) {
/* 127 */                   IiO1l1i iiO1l1i = (IiO1l1i) ((O0IooIIl00) it2.next());
/* 135 */                   Iterator it3 = iiO1l1i.I001iOo1i0O().iterator();
                            while (true) {
/* 143 */                       if (!it3.hasNext()) {
/* 157 */                           next2 = null;
                                    break;
                                }
/* 145 */                       next2 = it3.next();
/* 154 */                       if (((Annotation) next2) instanceof ToolParam) {
                                    break;
                                }
                            }
/* 165 */                   ToolParam toolParam = next2 instanceof ToolParam ? (ToolParam) next2 : null;
/* 170 */                   O01l0lO0li typeJsonSchema = getTypeJsonSchema(iiO1l1i.I000l1());
/* 174 */                   if (toolParam != null && (strDescription = toolParam.description()) != null) {
/* 182 */                       typeJsonSchema.I0001Ioi1lo("description", strDescription);
                            }
/* 195 */                   if (iiO1l1i.I000l1().I00iiI.I00iiI()) {
/* 197 */                       Boolean bool = Boolean.TRUE;
/* 199 */                       typeJsonSchema.getClass();
/* 204 */                       O01li1IO o01li1IO = new O01li1IO();
/* 207 */                       o01li1IO.I00iOIl = bool;
/* 211 */                       typeJsonSchema.I0000oI00("nullable", o01li1IO);
                            }
/* 218 */                   o01l0lO0li2.I0000oI00(toModelParamName(iiO1l1i), typeJsonSchema);
                        }
/* 224 */               O01I0il01001 o01I0il01001 = new O01I0il01001();
/* 227 */               Iterator it4 = listI001iOo1i0O.iterator();
                        while (true) {
/* 231 */                   boolean zHasNext = it4.hasNext();
/* 235 */                   arrayList = o01I0il01001.I00iOIl;
/* 237 */                   if (!zHasNext) {
                                break;
                            }
/* 245 */                   IiO1l1i iiO1l1i2 = (IiO1l1i) ((O0IooIIl00) it4.next());
/* 251 */                   if (!iiO1l1i2.I00100o1O0lo()) {
/* 253 */                       String modelParamName = toModelParamName(iiO1l1i2);
/* 257 */                       if (modelParamName == null) {
/* 259 */                           obj = O01iIOolI.I00iOIl;
                                } else {
/* 264 */                           O01li1IO o01li1IO2 = new O01li1IO();
/* 267 */                           o01li1IO2.I00iOIl = modelParamName;
/* 269 */                           VarHandle.storeStoreFence();
/* 272 */                           obj = o01li1IO2;
                                }
/* 273 */                       arrayList.add(obj);
                            }
                        }
/* 279 */               O01l0lO0li o01l0lO0li3 = new O01l0lO0li();
/* 286 */               o01l0lO0li3.I0001Ioi1lo("type", "object");
/* 291 */               o01l0lO0li3.I0000oI00("properties", o01l0lO0li2);
/* 298 */               if (!arrayList.isEmpty()) {
/* 302 */                   o01l0lO0li3.I0000oI00("required", o01I0il01001);
                        }
/* 307 */               o01l0lO0li.I0000oI00("parameters", o01l0lO0li3);
                    }
/* 743 */           return o01l0lO0li;
                }

                public final boolean getUseSnakeCase() {
/* 1 */             return this.useSnakeCase;
                }
            }
