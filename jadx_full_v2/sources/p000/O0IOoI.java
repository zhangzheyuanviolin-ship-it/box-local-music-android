            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashSet;
            import java.util.Iterator;
            import kotlin.Metadata;
            
            public final class O0IOoI implements IllOOo00lI {
                public final int I00iOIl;
                public O0Ii1IOoiO I00iiI;

                public O0IOoI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    OI000ilOol oI000ilOolI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 6 */             O0Ii1IOoiO o0Ii1IOoiO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 452 */                   return new O0Ii0OOI(o0Ii1IOoiO);
                        case 1:
/* 445 */                   return o0Ii1IOoiO.I00O0o1oo(o0Ii1IOoiO.I00Iooi00oi().I00Ol10().I00IoiI(), O0Ii0i1i0ioO.I00iOIl);
                        case 2:
/* 426 */                   return o0Ii1IOoiO.I00O0o1oo(o0Ii1IOoiO.I00Iooi00oi().I00iOIl(), O0Ii0i1i0ioO.I00iOIl);
                        case 3:
/* 411 */                   return o0Ii1IOoiO.I00O0o1oo(o0Ii1IOoiO.I00Iooi00oi().I00Ol10().I00IoiI(), O0Ii0i1i0ioO.I00iiI);
                        case 4:
/* 392 */                   return o0Ii1IOoiO.I00O0o1oo(o0Ii1IOoiO.I00Iooi00oi().I00iOIl(), O0Ii0i1i0ioO.I00iiI);
                        case 5:
/* 241 */                   HashSet hashSet = O0Ii1IOoiO.I00iio;
/* 243 */                   IOIOill iOIOillI00IoO0 = o0Ii1IOoiO.I00IoO0();
/* 247 */                   Class cls = o0Ii1IOoiO.I00iiI;
/* 257 */                   OOoOiOo01lo oOoOiOo01lo = ((O0Ii0OOI) o0Ii1IOoiO.I00iiO.getValue()).I00000oIO;
/* 261 */                   O0O00I1Ili o0O00I1Ili = O0IiOiOI.I00000oOI[0];
/* 267 */                   OiII0Iii oiII0Iii = (OiII0Iii) oOoOiOo01lo.invoke();
/* 269 */                   Ii10lIo0l1 ii10lIo0l1 = oiII0Iii.I00000oIO;
/* 273 */                   OI0010oo1o oI0010oo1o = (OI0010oo1o) ii10lIo0l1.I00000oOI;
/* 277 */                   if (iOIOillI00IoO0.I0000Il00O && cls.isAnnotationPresent(Metadata.class)) {
/* 291 */                       I1ooIoloo0 i1ooIoloo0 = ((IOIOiIiilIl) ii10lIo0l1.I0010o).I00000oOI;
/* 295 */                       IOIOOIoOIO iOIOOIoOIO = new IOIOOIoOIO();
/* 298 */                       iOIOOIoOIO.I00000oIO = iOIOillI00IoO0;
/* 300 */                       iOIOOIoOIO.I00000oOI = null;
/* 302 */                       VarHandle.storeStoreFence();
/* 309 */                       oI000ilOolI00000oIO = (OI000ilOol) i1ooIoloo0.invoke(iOIOOIoOIO);
                            } else {
/* 312 */                       oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1o, iOIOillI00IoO0);
                            }
/* 316 */                   if (oI000ilOolI00000oIO != null) {
/* 380 */                       return oI000ilOolI00000oIO;
                            }
/* 322 */                   if (cls.isSynthetic()) {
/* 324 */                       return O0Ii1IOoiO.I00IoIO0lI(iOIOillI00IoO0, oiII0Iii);
                            }
/* 329 */                   OOoOI1lIOi oOoOI1lIOiI00000oIO = lIll1Iio01.I00000oIO(cls);
/* 342 */                   O0i1lIiil o0i1lIiil = oOoOI1lIOiI00000oIO != null ? (O0i1lIiil) oOoOI1lIOiI00000oIO.I00000oOI.I0000Il00O : null;
                            switch (o0i1lIiil != null ? O0Ii11o0O.I00000oIO[o0i1lIiil.ordinal()] : -1) {
                                case -1:
                                case 6:
/* 376 */                           IOOlIIilOl0.I000OiO("Unresolved class: ", cls, " (kind = ", o0i1lIiil);
/* 5 */                             return null;
                                case 0:
                                default:
/* 359 */                           I000II.I00000oIO();
/* 5 */                             return null;
                                case 1:
                                case 2:
                                case 3:
                                case 4:
/* 369 */                           return O0Ii1IOoiO.I00IoIO0lI(iOIOillI00IoO0, oiII0Iii);
                                case 5:
/* 365 */                           IOOlIIilOl0.I000OiO("Unknown class: ", cls, " (kind = ", o0i1lIiil);
/* 5 */                             return null;
                            }
                        case 6:
/* 194 */                   Annotation[] annotations = o0Ii1IOoiO.I00iiI.getAnnotations();
/* 200 */                   ArrayList arrayList = new ArrayList();
/* 204 */                   for (Annotation annotation : annotations) {
/* 228 */                       if (!O0Ii1IOoiO.I00iio.contains(((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00().getName())) {
/* 230 */                           arrayList.add(annotation);
                                }
                            }
/* 236 */                   return Oolli0oi0.I000OiO(arrayList);
                        case 7:
/* 81 */                    Class cls2 = o0Ii1IOoiO.I00iiI;
/* 87 */                    if (cls2.isAnonymousClass()) {
/* 5 */                         return null;
                            }
/* 90 */                    IOIOill iOIOillI00IoO02 = o0Ii1IOoiO.I00IoO0();
/* 96 */                    if (!iOIOillI00IoO02.I0000Il00O) {
/* 187 */                       return iOIOillI00IoO02.I0001Ioi1lo().I00000oOI();
                            }
/* 98 */                    String simpleName = cls2.getSimpleName();
/* 102 */                   Method enclosingMethod = cls2.getEnclosingMethod();
/* 108 */                   if (enclosingMethod != null) {
/* 129 */                       return OlOoOIi0o.I00Iooi00oi(simpleName, enclosingMethod.getName() + '$', simpleName);
                            }
/* 134 */                   Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
/* 138 */                   if (enclosingConstructor == null) {
/* 165 */                       int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(simpleName, '$', 0, 6);
                                return iI001i1O0Ol == -1 ? simpleName : simpleName.substring(iI001i1O0Ol + 1, simpleName.length());
                            }
/* 159 */                   return OlOoOIi0o.I00Iooi00oi(simpleName, enclosingConstructor.getName() + '$', simpleName);
                        case 8:
/* 60 */                    if (o0Ii1IOoiO.I00iiI.isAnonymousClass()) {
/* 5 */                         return null;
                            }
/* 63 */                    IOIOill iOIOillI00IoO03 = o0Ii1IOoiO.I00IoO0();
/* 69 */                    if (iOIOillI00IoO03.I0000Il00O) {
/* 5 */                         return null;
                            }
/* 78 */                    return iOIOillI00IoO03.I00000oIO().I00000oIO.I00000oIO;
                        default:
/* 11 */                    Collection collectionI001lloI = o0Ii1IOoiO.I001lloI();
/* 25 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(collectionI001lloI, 10));
/* 28 */                    Iterator it = collectionI001lloI.iterator();
/* 36 */                    while (it.hasNext()) {
/* 49 */                        arrayList2.add(new IiO11010IiO(o0Ii1IOoiO, (IOo1IIOOiO1o) it.next()));
                            }
/* 53 */                    return arrayList2;
                    }
                }
            }
