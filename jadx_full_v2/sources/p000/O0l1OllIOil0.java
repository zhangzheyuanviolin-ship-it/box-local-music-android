            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class O0l1OllIOil0 implements IllOOo00lI {
                public final int I00iOIl;
                public O0l1i0l I00iiI;

                public O0l1OllIOil0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             O0l1i0l o0l1i0l = this.I00iiI;
                    switch (i) {
                        case 0:
/* 100 */                   if (IiOiOOIo.I0001Ioi1lo(o0l1i0l) == null) {
/* 106 */                       return null;
                            }
/* 104 */                   Object obj = o0l1i0l.I00io1l.I00iOIl;
/* 106 */                   return null;
                        case 1:
/* 13 */                    OOo1oliI oOo1oliI = o0l1i0l.I00ioIO;
/* 15 */                    ArrayList typeParameters = oOo1oliI.getTypeParameters();
/* 27 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(typeParameters, 10));
/* 30 */                    Iterator it = typeParameters.iterator();
/* 38 */                    while (it.hasNext()) {
/* 44 */                        OOoO0OoIIO oOoO0OoIIO = (OOoO0OoIIO) it.next();
/* 52 */                        OoOOiO ooOOiOI00000oIO = ((OoOOol) o0l1i0l.I00l0OO0IO.I00iiI).I00000oIO(oOoO0OoIIO);
/* 56 */                        if (ooOOiOI00000oIO == null) {
/* 94 */                            throw new AssertionError("Parameter " + oOoO0OoIIO + " surely belongs to class " + oOo1oliI + ", so it must be resolved");
                                }
/* 58 */                        arrayList.add(ooOOiOI00000oIO);
                            }
/* 95 */                    return arrayList;
                        default:
/* 8 */                     return lOoii1O1lI1O.I00000oOI(o0l1i0l);
                    }
                }
            }
