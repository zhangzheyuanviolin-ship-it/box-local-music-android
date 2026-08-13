            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class I1O011OIOO0 {
                public final char I00000oIO;
                public final List I00000oOI;
                public final ArrayList I0000Il00O;

                public I1O011OIOO0(char c, List list, ArrayList arrayList) {
/* 4 */             this.I00000oIO = c;
/* 6 */             this.I00000oOI = list;
/* 8 */             this.I0000Il00O = arrayList;
/* 12 */            I1O011OIOO0[] i1o011oioo0Arr = new I1O011OIOO0[Barcode.FORMAT_QR_CODE];
/* 16 */            for (int i = 0; i < 256; i++) {
/* 20 */                Iterator it = this.I0000Il00O.iterator();
/* 24 */                Object obj = null;
/* 25 */                boolean z = false;
/* 26 */                Object obj2 = null;
                        while (true) {
/* 31 */                    if (it.hasNext()) {
/* 33 */                        Object next = it.next();
/* 42 */                        if (((I1O011OIOO0) next).I00000oIO == i) {
/* 44 */                            if (z) {
                                        break;
                                    }
/* 47 */                            z = true;
/* 48 */                            obj2 = next;
                                }
                            } else if (z) {
/* 53 */                        obj = obj2;
                            }
                        }
/* 54 */                i1o011oioo0Arr[i] = obj;
                    }
                }
            }
