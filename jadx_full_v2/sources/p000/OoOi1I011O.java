            package p000;

            import android.util.Log;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class OoOi1I011O implements Function1 {
                public static final OoOi1I011O I00iiI = new OoOi1I011O(0);
                public static final OoOi1I011O I00iiO = new OoOi1I011O(1);
                public static final OoOi1I011O I00iio = new OoOi1I011O(2);
                public static final OoOi1I011O I00ilI0I1 = new OoOi1I011O(3);
                public static final OoOi1I011O I00ilO0 = new OoOi1I011O(4);
                public static final OoOi1I011O I00io1l = new OoOi1I011O(5);
                public static final OoOi1I011O I00ioIO = new OoOi1I011O(6);
                public static final OoOi1I011O I00l0I0l0lO1 = new OoOi1I011O(7);
                public final int I00iOIl;

                public OoOi1I011O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             boolean z = false;
                    switch (i) {
                        case 0:
/* 326 */                   return Boolean.valueOf(((Ii1Ool1) obj) instanceof IIiIoIl11IO);
                        case 1:
/* 317 */                   return Boolean.valueOf(!(((Ii1Ool1) obj) instanceof IOo1IIOOiO1o));
                        case 2:
/* 307 */                   return IOOi0Ool1i.I001IO000(((IIiIoIl11IO) ((Ii1Ool1) obj)).getTypeParameters());
                        case 3:
/* 271 */                   IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((Ooioo0o1l0) obj).I00iOIl().I00100o1O0lo();
/* 275 */                   if (iOIiO1lIl0lI00100o1O0lo != null && (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) && (((OoOOiO) iOIiO1lIl0lI00100o1O0lo).I000lI() instanceof IiOoI0oI)) {
/* 291 */                       z = true;
                            }
/* 292 */                   return Boolean.valueOf(z);
                        case 4:
/* 245 */                   IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ((Ooioo0o1l0) obj).I00iOIl().I00100o1O0lo();
/* 249 */                   if (iOIiO1lIl0lI00100o1O0lo2 != null && ((iOIiO1lIl0lI00100o1O0lo2 instanceof IiOoI0oI) || (iOIiO1lIl0lI00100o1O0lo2 instanceof OoOOiO))) {
/* 259 */                       z = true;
                            }
/* 260 */                   return Boolean.valueOf(z);
                        case 5:
/* 216 */                   Throwable th = (Throwable) obj;
/* 218 */                   if (th != null && !(th instanceof CancellationException) && l11I11lO.I0000O(6, "CXCP")) {
/* 235 */                       Log.e("CXCP", "Surface setup error!", th);
                            }
/* 238 */                   return ooiIlOl1iI;
                        case 6:
/* 211 */                   return obj.toString();
                        case 7:
/* 206 */                   return obj.toString();
                        case 8:
/* 202 */                   ((O0iIoIOO0O0) obj).getClass();
/* 5 */                     return null;
                        case 9:
/* 199 */                   throw IIlIOloOOO.I000l1(obj);
                        case 10:
/* 190 */                   return IiOiOOIo.I000OiO((IIiO00o1o) obj);
                        case 11:
/* 185 */                   return OlI1o0ooI.I00IO1;
                        case 12:
/* 149 */                   IIiO00o1o iIiO00o1o = (IIiO00o1o) obj;
/* 155 */                   if (iIiO00o1o.I000oI1ioi() == 1) {
/* 161 */                       OI000ilOol oI000ilOol = (OI000ilOol) iIiO00o1o.I000lI();
/* 163 */                       String str = O00oO0liO11.I00000oIO;
/* 175 */                       if (O00oO0liO11.I000OiO.containsKey(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol))) {
/* 177 */                           z = true;
                                }
                            }
/* 178 */                   return Boolean.valueOf(z);
                        case 13:
/* 144 */                   return ((O1I00oo) obj).I00000oOI.invoke();
                        case 14:
/* 137 */                   return (IIiO00o1o) obj;
                        case 15:
/* 134 */                   return (IIiO00o1o) obj;
                        case 16:
/* 118 */                   String strConcat = "java/util/".concat("Spliterator");
/* 122 */                   O00olOO0 o00olOO0 = OO1oolioio.I00000oOI;
/* 128 */                   ((Ol0IIO) obj).I00000oOI(strConcat, o00olOO0, o00olOO0);
/* 131 */                   Oi11IIl0O0 oi11IIl0O0 = Oi11IIl0O0.I00iOIl;
/* 133 */                   return ooiIlOl1iI;
                        case 17:
/* 92 */                    if (((Ill0IO) obj) != null) {
/* 101 */                       return Boolean.valueOf(!r5.equals(OlIllOO11lOl.I001iOo1i0O));
                            }
/* 108 */                   I000II.I000iOII("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
/* 5 */                     return null;
                        default:
/* 11 */                    Map map = (Map) obj;
/* 19 */                    if (map.size() <= 10) {
/* 87 */                        return Il01100l.I00iOIl;
                            }
/* 46 */                    List listI00i01iIIliI = IOOi0Ool1i.I00i01iIIliI(IOOi0Ool1i.I00Ol1ll1(map.values(), new OiOIlO1OII0(9)), map.size() - 10);
/* 50 */                    Iterator it = listI00i01iIIliI.iterator();
/* 58 */                    while (it.hasNext()) {
/* 80 */                        Log.i("ImplicitCacheManager", "Cache limit reached. Remove least recent used cache with name ".concat(String.valueOf(((i1Ii1ooOII0) it.next()).I00000oIO)));
                            }
/* 84 */                    return listI00i01iIIliI;
                    }
                }
            }
