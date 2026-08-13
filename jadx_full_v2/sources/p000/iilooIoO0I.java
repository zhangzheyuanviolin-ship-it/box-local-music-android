            package p000;

            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.ValueType;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class iilooIoO0I {
                public static final Object I00000oIO(Object obj, ValueType valueType) {
/* 7 */             int i = IOllOi.I00000oIO[valueType.ordinal()];
/* 9 */             boolean zBooleanValue = true;
/* 10 */            if (i == 1) {
/* 280 */               if (obj instanceof Integer) {
/* 282 */                   return obj;
                        }
/* 285 */               if (obj instanceof Float) {
/* 294 */                   return Integer.valueOf((int) ((Number) obj).floatValue());
                        }
/* 301 */               if (obj instanceof Double) {
/* 310 */                   return Integer.valueOf((int) ((Number) obj).doubleValue());
                        }
/* 317 */               if (!(obj instanceof String)) {
                            return obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : "";
                        }
/* 323 */               Integer numI000lI = OlOolloIIOl0.I000lI(10, (String) obj);
                        return numI000lI == null ? "" : numI000lI;
                    }
/* 13 */            Float fValueOf = null;
/* 14 */            if (i == 2) {
/* 198 */               if (obj instanceof Integer) {
/* 207 */                   return Float.valueOf(((Number) obj).intValue());
                        }
/* 214 */               if (obj instanceof Float) {
/* 216 */                   return obj;
                        }
/* 219 */               if (obj instanceof Double) {
/* 228 */                   return Float.valueOf((float) ((Number) obj).doubleValue());
                        }
/* 235 */               if (!(obj instanceof String)) {
/* 259 */                   if (obj instanceof Boolean) {
/* 273 */                       return Float.valueOf(((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
                            }
/* 346 */                   return "";
                        }
/* 237 */               String str = (String) obj;
                        try {
/* 243 */                   if (OlOoll1I0.I0000oI00(str)) {
/* 249 */                       fValueOf = Float.valueOf(Float.parseFloat(str));
                            }
                        } catch (NumberFormatException unused) {
                        }
                        return fValueOf == null ? "" : fValueOf;
                    }
/* 17 */            if (i == 3) {
/* 124 */               if (obj instanceof Integer) {
/* 133 */                   return Double.valueOf(((Number) obj).intValue());
                        }
/* 140 */               if (obj instanceof Float) {
/* 149 */                   return Double.valueOf(((Number) obj).floatValue());
                        }
/* 156 */               if (obj instanceof Double) {
/* 158 */                   return obj;
                        }
/* 161 */               if (obj instanceof String) {
/* 165 */                   Double dI0001Ioi1lo = OlOoll1I0.I0001Ioi1lo((String) obj);
                            return dI0001Ioi1lo == null ? "" : dI0001Ioi1lo;
                        }
/* 176 */               if (obj instanceof Boolean) {
/* 191 */                   return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                        }
/* 346 */               return "";
                    }
/* 20 */            if (i != 4) {
/* 23 */                if (i == 5) {
/* 25 */                    return obj.toString();
                        }
/* 30 */                I000II.I00000oIO();
/* 13 */                return null;
                    }
/* 37 */            if (obj instanceof Integer) {
/* 43 */                zBooleanValue = obj.equals(0);
                    } else if (obj instanceof Boolean) {
/* 54 */                zBooleanValue = ((Boolean) obj).booleanValue();
                    } else if (!(obj instanceof Float) ? !(obj instanceof Double) ? !(obj instanceof String) || ((CharSequence) obj).length() <= 0 : Math.abs(((Number) obj).doubleValue()) <= 1.0E-6d : Math.abs(((Number) obj).floatValue()) <= 1.0E-6d) {
/* 84 */                zBooleanValue = false;
                    }
/* 117 */           return Boolean.valueOf(zBooleanValue);
                }

                public static final ArrayList I00000oOI(int i, Integer num, int i2, float f, float f2, List list, boolean z, boolean z2) {
/* 5 */             String strValueOf = String.valueOf(i);
/* 9 */             IOllO1I iOllO1I = iIIiO0.I00000oIO;
/* 11 */            Object o0iO0Oii0o00 = new O0iO0Oii0o00(iOllO1I, strValueOf);
/* 14 */            if (num != null) {
/* 42 */                o0iO0Oii0o00 = new OIOOoO1O1oO(iOllO1I, num.intValue() > 2000 ? 2000.0f : 256.0f, num.intValue(), i, ValueType.INT, true);
                    }
/* 58 */            OIOOoO1O1oO oIOOoO1O1oO = new OIOOoO1O1oO(iIIiO0.I00000oOI, 5.0f, 100.0f, i2, ValueType.INT, true);
/* 63 */            ValueType valueType = ValueType.FLOAT;
/* 72 */            OIOOoO1O1oO oIOOoO1O1oO2 = new OIOOoO1O1oO(iIIiO0.I0000Il00O, 0.0f, 1.0f, f, valueType, true);
/* 85 */            OIOOoO1O1oO oIOOoO1O1oO3 = new OIOOoO1O1oO(iIIiO0.I0000O, 0.0f, 2.0f, f2, valueType, true);
/* 95 */            String label = ((Accelerator) list.get(0)).getLabel();
/* 100 */           List list2 = list;
/* 110 */           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 113 */           Iterator it = list2.iterator();
/* 121 */           while (it.hasNext()) {
/* 133 */               arrayList.add(((Accelerator) it.next()).getLabel());
                    }
/* 167 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I000O01llI0(o0iO0Oii0o00, oIOOoO1O1oO, oIOOoO1O1oO2, oIOOoO1O1oO3, new Oii1lO01il(label, arrayList)));
/* 170 */           if (z) {
/* 179 */               arrayList2.add(new II11OlOIOOOl(iIIiO0.I000lI));
                    }
/* 182 */           if (z2) {
/* 191 */               arrayList2.add(new II11OlOIOOOl(iIIiO0.I000oI1ioi));
                    }
/* 1750 */          return arrayList2;
                }
            }
