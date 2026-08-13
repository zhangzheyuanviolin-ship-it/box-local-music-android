            package p000;

            import android.os.Bundle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I0lOo1lO implements Function1 {
                public final int I00iOIl;
                public OOo0ooi I00iiI;

                public I0lOo1lO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             boolean z = true;
/* 5 */             OOo0ooi oOo0ooi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 132 */                   oOo0ooi.I00iOIl = (IliIO10oO0) obj;
/* 134 */                   return Boolean.TRUE;
                        case 1:
/* 108 */                   Io011oOlO01 io011oOlO01 = (Io011oOlO01) obj;
/* 120 */                   if (O0000Ioio00.I0000O(io011oOlO01.I00O0i0ii(), "waiting")) {
/* 122 */                       oOo0ooi.I00iOIl = io011oOlO01;
/* 124 */                       z = false;
                            }
/* 125 */                   return Boolean.valueOf(z);
                        case 2:
/* 87 */                    IoI1i1l ioI1i1l = (IoI1i1l) obj;
/* 89 */                    Object obj2 = oOo0ooi.I00iOIl;
/* 91 */                    if (obj2 == null && ioI1i1l.I00o101lO) {
/* 97 */                        oOo0ooi.I00iOIl = ioI1i1l;
                            } else if (obj2 != null) {
/* 102 */                       ioI1i1l.getClass();
                            }
/* 105 */                   return Boolean.TRUE;
                        case 3:
/* 65 */                    String str = (String) obj;
/* 67 */                    Object obj3 = oOo0ooi.I00iOIl;
/* 69 */                    if (obj3 != null && ((Bundle) obj3).containsKey(str)) {
/* 81 */                        z = false;
                            }
/* 82 */                    return Boolean.valueOf(z);
                        case 4:
/* 46 */                    IiIill0O0li1 iiIill0O0li1 = (OoIOloiIii) obj;
/* 55 */                    if (((O1ooOo) iiIill0O0li1).I00iOIl.I00lll10) {
/* 57 */                        oOo0ooi.I00iOIl = iiIill0O0li1;
/* 59 */                        z = false;
                            }
/* 60 */                    return Boolean.valueOf(z);
                        case 5:
/* 21 */                    O0llioI1 o0llioI1 = ((OoIOoioo1) ((OoIOloiIii) obj)).I00o0iI0io1;
/* 25 */                    List listI000OiO = (List) oOo0ooi.I00iOIl;
/* 27 */                    if (listI000OiO != null) {
/* 29 */                        listI000OiO.add(o0llioI1);
                            } else {
/* 37 */                        listI000OiO = IOOi1I.I000OiO(o0llioI1);
                            }
/* 41 */                    oOo0ooi.I00iOIl = listI000OiO;
/* 43 */                    return OoIOloOIOI1l.I00iiI;
                        default:
/* 12 */                    oOo0ooi.I00iOIl = (O01O0o1iI) obj;
/* 14 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
