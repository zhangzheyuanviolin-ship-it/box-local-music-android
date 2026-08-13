            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            
/* 9 */     public final class o00010OI0o implements llOo0OilI {
                public static final loIiOOlI0oI1 I00iio = new loIiOOlI0oI1(3);
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public o00010OI0o(Class cls, llOl001olOi llol001oloi, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = cls;
/* 5 */             this.I00iiO = llol001oloi;
                }

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 76 */                    if (o0ioi0io1ioo.I00000oIO == ((Class) this.I00iiI)) {
/* 81 */                        return (llOl001olOi) this.I00iiO;
                            }
/* 3 */                     return null;
                        case 1:
/* 39 */                    Class cls = (Class) this.I00iiI;
/* 41 */                    Class<?> cls2 = o0ioi0io1ioo.I00000oIO;
/* 47 */                    if (!cls.isAssignableFrom(cls2)) {
/* 3 */                         return null;
                            }
/* 52 */                    llOl001olOi llol001oloi = (llOl001olOi) this.I00iiO;
/* 57 */                    loIlOiOii loiloioii = new loIlOiOii(3);
/* 60 */                    loiloioii.I0000Il00O = llol001oloi;
/* 62 */                    loiloioii.I00000oOI = cls2;
/* 64 */                    VarHandle.storeStoreFence();
/* 67 */                    return loiloioii;
                        default:
/* 16 */                    lli010l0ii lli010l0iiVar = (lli010l0ii) o0ioi0io1ioo.I00000oIO.getAnnotation(lli010l0ii.class);
/* 18 */                    if (lli010l0iiVar == null) {
/* 3 */                         return null;
                            }
/* 30 */                    return I00000oOI((i0O1lIi1O0IO) this.I00iiI, i1ii1o0, o0ioi0io1ioo, lli010l0iiVar, true);
                    }
                }

                public llOl001olOi I00000oOI(i0O1lIi1O0IO i0o1lii1o0io, I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo, lli010l0ii lli010l0iiVar, boolean z) {
                    llOl001olOi llol001oloiI00000oIO;
/* 15 */            Object objZza = i0o1lii1o0io.I0000O(new o0IOi0io1iOo(lli010l0iiVar.zza()), true).zza();
/* 19 */            boolean z2 = objZza instanceof llOl001olOi;
/* 21 */            boolean zZzb = lli010l0iiVar.zzb();
/* 25 */            if (z2) {
/* 27 */                llol001oloiI00000oIO = (llOl001olOi) objZza;
                    } else {
/* 32 */                if (!(objZza instanceof llOo0OilI)) {
/* 73 */                    String name = objZza.getClass().getName();
/* 79 */                    String strI0000O = iO1lo1I1iI.I0000O(o0ioi0io1ioo.I00000oOI);
/* 102 */                   StringBuilder sb = new StringBuilder(String.valueOf(strI0000O).length() + name.length() + 62 + 99);
/* 109 */                   IIl001iO0Io.I001lIiIIo1O(sb, "Invalid attempt to bind an instance of ", name, " as a @JsonAdapter for ", strI0000O);
/* 114 */                   sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
/* 399 */                   throw new IllegalArgumentException(sb.toString());
                        }
/* 34 */                llOo0OilI lloo0oili = (llOo0OilI) objZza;
/* 36 */                if (z) {
/* 48 */                    llOo0OilI lloo0oili2 = (llOo0OilI) ((ConcurrentHashMap) this.I00iiO).putIfAbsent(o0ioi0io1ioo.I00000oIO, lloo0oili);
/* 50 */                    if (lloo0oili2 != null) {
/* 52 */                        lloo0oili = lloo0oili2;
                            }
                        }
/* 53 */                llol001oloiI00000oIO = lloo0oili.I00000oIO(i1ii1o0, o0ioi0io1ioo);
                    }
                    return (llol001oloiI00000oIO == null || !zZzb) ? llol001oloiI00000oIO : llol001oloiI00000oIO.I00000oOI();
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 64 */                    llOl001olOi llol001oloi = (llOl001olOi) this.I00iiO;
/* 70 */                    String name = ((Class) this.I00iiI).getName();
/* 74 */                    String strValueOf = String.valueOf(llol001oloi);
/* 93 */                    StringBuilder sb = new StringBuilder(name.length() + 22 + strValueOf.length() + 1);
/* 98 */                    IIl001iO0Io.I001lIiIIo1O(sb, "Factory[type=", name, ",adapter=", strValueOf);
/* 101 */                   sb.append("]");
/* 104 */                   return sb.toString();
                        case 1:
/* 17 */                    llOl001olOi llol001oloi2 = (llOl001olOi) this.I00iiO;
/* 23 */                    String name2 = ((Class) this.I00iiI).getName();
/* 27 */                    String strValueOf2 = String.valueOf(llol001oloi2);
/* 46 */                    StringBuilder sb2 = new StringBuilder(name2.length() + 31 + strValueOf2.length() + 1);
/* 51 */                    IIl001iO0Io.I001lIiIIo1O(sb2, "Factory[typeHierarchy=", name2, ",adapter=", strValueOf2);
/* 54 */                    sb2.append("]");
/* 57 */                    return sb2.toString();
                        default:
/* 10 */                    return super.toString();
                    }
                }
            }
