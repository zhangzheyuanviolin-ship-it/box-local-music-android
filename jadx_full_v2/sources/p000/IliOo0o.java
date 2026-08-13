            package p000;

            import android.util.Log;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.URI;
            import java.security.AccessControlException;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class IliOo0o {
                public static final I1I0i0Ilo1Oi I00000oIO;

                static {
/* 3 */             IOloio1Ili iOloio1Ili = Ilii0Oi0I1O.I0000oI00;
/* 9 */             I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(12);
/* 14 */            ArrayList arrayList = new ArrayList();
/* 17 */            i1I0i0Ilo1Oi.I00iiI = arrayList;
/* 19 */            i1I0i0Ilo1Oi.I00iiO = iOloio1Ili;
                    try {
/* 28 */                i1I0i0Ilo1Oi.I001iOo1i0O(new File("/system/fonts/DroidSans.ttf"));
/* 38 */                i1I0i0Ilo1Oi.I001iOo1i0O(new File("/system/fonts/DroidSans-Bold.ttf"));
/* 48 */                i1I0i0Ilo1Oi.I001iOo1i0O(new File("/system/fonts/DroidSansMono.ttf"));
/* 51 */                VarHandle.storeStoreFence();
                    } catch (IOException e) {
/* 57 */                e.printStackTrace();
                        try {
/* 65 */                    Oi1ol0llI oi1ol0llI = new Oi1ol0llI(11, false);
/* 69 */                    oi1ol0llI.I00iiI = null;
/* 71 */                    ArrayList arrayListI000iOII = oi1ol0llI.I000iOII();
/* 81 */                    ArrayList arrayList2 = new ArrayList(arrayListI000iOII.size());
/* 84 */                    Iterator it = arrayListI000iOII.iterator();
/* 92 */                    while (it.hasNext()) {
/* 105 */                       arrayList2.add(new File((URI) it.next()));
                            }
/* 115 */                   if (!arrayList2.isEmpty()) {
/* 117 */                       ArrayList arrayListI00OIO1 = i1I0i0Ilo1Oi.I00OIO1(arrayList2);
/* 121 */                       if (arrayListI00OIO1 == null || arrayListI00OIO1.isEmpty()) {
/* 135 */                           Log.w("PdfBox-Android", "Building on-disk font cache, this may take a while");
/* 138 */                           i1I0i0Ilo1Oi.I00OloOo(arrayList2);
/* 141 */                           i1I0i0Ilo1Oi.I00Ol1ll1();
/* 170 */                           Log.w("PdfBox-Android", "Finished building on-disk font cache, found " + arrayList.size() + " fonts");
                                } else {
/* 129 */                           arrayList.addAll(arrayListI00OIO1);
                                }
                            }
                        } catch (AccessControlException e2) {
/* 176 */                   Log.e("PdfBox-Android", "Error accessing the file system", e2);
                        }
/* 179 */               VarHandle.storeStoreFence();
                    }
/* 182 */           I00000oIO = i1I0i0Ilo1Oi;
                }
            }
