            package p000;

            import com.google.mlkit.genai.schema.guided.GenerableProvider;
            import java.io.IOException;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ServiceLoader;
            import java.util.Set;
            
            public final class I1lOO0Ii00 implements IllOOo00lI {
                public static final I1lOO0Ii00 I00iiI = new I1lOO0Ii00(0);
                public static final I1lOO0Ii00 I00iiO = new I1lOO0Ii00(1);
                public static final I1lOO0Ii00 I00iio = new I1lOO0Ii00(2);
                public static final I1lOO0Ii00 I00ilI0I1 = new I1lOO0Ii00(3);
                public static final I1lOO0Ii00 I00ilO0 = new I1lOO0Ii00(4);
                public static final I1lOO0Ii00 I00io1l = new I1lOO0Ii00(5);
                public static final I1lOO0Ii00 I00ioIO = new I1lOO0Ii00(6);
                public static final I1lOO0Ii00 I00l0I0l0lO1 = new I1lOO0Ii00(7);
                public static final I1lOO0Ii00 I00l0OO0IO = new I1lOO0Ii00(8);
                public static final I1lOO0Ii00 I00li1OI = new I1lOO0Ii00(9);
                public static final I1lOO0Ii00 I00ll1 = new I1lOO0Ii00(11);
                public static final I1lOO0Ii00 I00lli11 = new I1lOO0Ii00(12);
                public static final I1lOO0Ii00 I00lll10 = new I1lOO0Ii00(13);
                public static final I1lOO0Ii00 I00o0iI0io1 = new I1lOO0Ii00(14);
                public static final I1lOO0Ii00 I00o0l1o1o0 = new I1lOO0Ii00(15);
                public final int I00iOIl;

                public I1lOO0Ii00(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 237 */                   return IOOiio0i.I00000oIO(iiO01ll11o1l.I00000oOI(1308617531));
                        case 1:
/* 202 */                   IIIOOOO1lo iIIOOOO1lo = IIIOOOO1lo.I00000oIO;
/* 218 */                   IIIOiO iIIOiO = (IIIOiO) IOOi0Ool1i.I001lloI(ServiceLoader.load(IIIOiO.class, IIIOiO.class.getClassLoader()));
/* 220 */                   if (iIIOiO != null) {
/* 222 */                       return iIIOiO;
                            }
/* 226 */                   I000II.I001IO000("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
/* 3 */                     return null;
                        case 2:
/* 197 */                   return IOOiio0i.I00000oIO(IOOiio0i.I00000oOI);
                        case 3:
/* 188 */                   Ii1ii0Oo0ioi ii1ii0Oo0ioi = new Ii1ii0Oo0ioi(new O1I0OloI("DefaultBuiltIns"));
/* 191 */                   ii1ii0Oo0ioi.I0000Il00O();
/* 194 */                   return ii1ii0Oo0ioi;
                        case 4:
/* 174 */                   Set set = IiOlOOll.I00000oOI;
/* 176 */                   return Il01100l.I00iOIl;
                        case 5:
/* 163 */                   Il0oiI1 il0oiI1 = Il0oiI1.I00iOIl;
/* 171 */                   return (Ii1ii0Oo0ioi) Ii1ii0Oo0ioi.I0001Ioi1lo.getValue();
                        case 6:
/* 147 */                   O0O00I1Ili[] o0O00I1IliArr = O00ll0iIIl.I000II;
/* 158 */                   return Collections.singletonMap(O00ioI0Ii1Io.I00000oIO, new OlOlol0il01("Deprecated in Java"));
                        case 7:
/* 117 */                   O1lOolo o1lOolo = O1lOolo.I00000oIO;
/* 129 */                   List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(ServiceLoader.load(O1li00Io.class, O1li00Io.class.getClassLoader()));
/* 137 */                   if (!listI00iIi0i1o.isEmpty()) {
/* 139 */                       return listI00iIi0i1o;
                            }
/* 143 */                   I000II.I001IO000("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
/* 3 */                     return null;
                        case 8:
/* 112 */                   return IOOiio0i.I00000oIO(IOOiio0i.I00000oOI);
                        case 9:
/* 107 */                   return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 106 */                   throw null;
                        case 11:
/* 96 */                    OlO1iIi1ol0 olO1iIi1ol0 = iOolIooliO.I00000oIO;
/* 105 */                   throw new IllegalStateException("No ColorScheme provided! Ensure your content is wrapped in OssLicensesTheme.");
                        case 12:
/* 86 */                    OlO1iIi1ol0 olO1iIi1ol02 = iOolIooliO.I00000oIO;
/* 95 */                    throw new IllegalStateException("No Typography provided!");
                        case 13:
/* 78 */                    Il11ooO1o il11ooO1o = l1O1OlOii.I00000oIO;
/* 81 */                    return lioolIIo0i.I00000oIO(3);
                        case 14:
/* 18 */                    OllO00oiil ollO00oiil = o0oiiO1o.I00000oIO;
/* 28 */                    ServiceLoader serviceLoaderLoad = ServiceLoader.load(GenerableProvider.class, o0oiiO1o.class.getClassLoader());
/* 38 */                    int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(serviceLoaderLoad, 10));
/* 44 */                    if (iI00000oIO < 16) {
/* 46 */                        iI00000oIO = 16;
                            }
/* 49 */                    LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 52 */                    Iterator it = serviceLoaderLoad.iterator();
/* 60 */                    while (it.hasNext()) {
/* 62 */                        Object next = it.next();
/* 73 */                        linkedHashMap.put(((GenerableProvider) next).getTargetClass(), next);
                            }
/* 77 */                    return linkedHashMap;
                        default:
/* 7 */                     OllO00oiil ollO00oiil2 = o1I0I0O.I000l1;
/* 13 */                    return O1o0111OI00.I0000Il00O().I00000oOI();
                    }
                }
            }
