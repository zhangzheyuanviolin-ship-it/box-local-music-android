            package p000;

            import android.net.Uri;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            
            public final class lolliO01l implements I1Oll0OOO {
                public final int I00000oIO;
                public IIlOoolol0ll I00000oOI;

                public lolliO01l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture apply(Object obj) throws IOException {
                    ListenableFuture listenableFuture;
/* 1 */             int i = this.I00000oIO;
/* 3 */             IIlOoolol0ll iIlOoolol0ll = this.I00000oOI;
                    switch (i) {
                        case 0:
                            synchronized (iIlOoolol0ll.I00l0OO0IO) {
/* 148 */                       listenableFuture = (ListenableFuture) iIlOoolol0ll.I00li1OI;
                            }
/* 151 */                   return listenableFuture;
                        case 1:
/* 138 */                   return IlloOoiiO.I0000Il00O(iIlOoolol0ll.I001IIilI0O((Uri) IlloOoiiO.I00000oIO((ListenableFuture) iIlOoolol0ll.I00iiO)));
                        case 2:
/* 116 */                   iIlOoolol0ll.I001IO000((Uri) IlloOoiiO.I00000oIO((ListenableFuture) iIlOoolol0ll.I00iiO), obj);
/* 119 */                   return Ioil1OOO.I00iiI;
                        default:
/* 8 */                     Uri uri = (Uri) obj;
/* 32 */                    Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                            try {
/* 38 */                        lloOo1iol llooo1iol = (lloOo1iol) iIlOoolol0ll.I00ilO0;
/* 40 */                        OillOo0 oillOo0I00000oOI = llooo1iol.I00000oOI(uriBuild);
/* 56 */                        if (((loIo0iiOoi) oillOo0I00000oOI.I00iiI).I00000oOI((Uri) oillOo0I00000oOI.I00ilI0I1)) {
/* 58 */                            OillOo0 oillOo0I00000oOI2 = llooo1iol.I00000oOI(uriBuild);
/* 62 */                            OillOo0 oillOo0I00000oOI3 = llooo1iol.I00000oOI(uri);
/* 68 */                            loIo0iiOoi loio0iiooi = (loIo0iiOoi) oillOo0I00000oOI2.I00iiI;
/* 74 */                            if (loio0iiooi != ((loIo0iiOoi) oillOo0I00000oOI3.I00iiI)) {
/* 97 */                                throw new IOO1IOl1O10("Cannot rename file across backends");
                                    }
/* 84 */                            loio0iiooi.I0001Ioi1lo((Uri) oillOo0I00000oOI2.I00ilI0I1, (Uri) oillOo0I00000oOI3.I00ilI0I1);
                                }
/* 98 */                        return Ioil1OOO.I00iiI;
                            } catch (IOException e) {
/* 101 */                       return IlloOoiiO.I00000oOI(e);
                            }
                    }
                }
            }
