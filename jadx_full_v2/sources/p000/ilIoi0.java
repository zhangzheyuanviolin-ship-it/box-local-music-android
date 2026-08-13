            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.proofreading.zzk;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class ilIoi0 {
                public static final int I000OOo1O = 0;
                public static final int I000OiO = 0;
                public iO110O11Ii I00000oIO;
                public iOioIII1i I00000oOI;
                public IOO0o0I1l I0000Il00O;
                public l01I1iOlI I0000O;
                public Executor I0000oI00;
                public Object I0001Ioi1lo;
                public l0I1O010oooi I000II;
                public iollI00lIIil I000O01llI0;

                public final liiiO1I1IlI I00000oIO(o0Il0li o0il0li, iiOlIi0l00ll iiolii0l00ll) {
/* 6 */             Parcel parcelI00O0i0ii = o0il0li.I00O0i0ii(3, o0il0li.I00Iooi00oi());
/* 10 */            int i = parcelI00O0i0ii.readInt();
/* 14 */            parcelI00O0i0ii.recycle();
/* 17 */            liiiO1I1IlI loiiooo1l = null;
/* 20 */            if (i < 0) {
/* 26 */                Log.w("ilIoi0", "Ignoring prepareInferenceEngine because service is older than V1");
/* 41 */                ((IIiOOI) iiolii0l00ll.I000OOo1O).I0000O(iOiI1oOo1l.I0000Il00O(8, null, "Preparation failed."));
/* 46 */                return new il1110("com.google.android.apps.aicore.aidl.ICancellationCallback", 3);
                    }
/* 50 */            Parcel parcelI00Iooi00oi = o0il0li.I00Iooi00oi();
/* 54 */            int i2 = iil0I01i.I00000oIO;
/* 56 */            parcelI00Iooi00oi.writeStrongBinder(iiolii0l00ll);
/* 60 */            Parcel parcelI00O0i0ii2 = o0il0li.I00O0i0ii(4, parcelI00Iooi00oi);
/* 64 */            IBinder strongBinder = parcelI00O0i0ii2.readStrongBinder();
/* 68 */            if (strongBinder != null) {
/* 71 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 84 */                loiiooo1l = iInterfaceQueryLocalInterface instanceof liiiO1I1IlI ? (liiiO1I1IlI) iInterfaceQueryLocalInterface : new lOiIOoo1l(strongBinder);
                    }
/* 87 */            parcelI00O0i0ii2.recycle();
/* 106 */           return loiiooo1l;
                }

                public final liiiO1I1IlI I00000oOI(o0Il0li o0il0li, il1ioo0oooi il1ioo0oooiVar, iii1IIii iii1iiii) {
/* 1 */             zzk zzkVar = il1ioo0oooiVar.I0000O;
/* 3 */             liiiO1I1IlI loiiooo1l = null;
/* 12 */            iiOlIi0l00ll iiolii0l00ll = zzkVar != null ? new iiOlIi0l00ll(zzkVar) : null;
/* 13 */            String str = il1ioo0oooiVar.I00000oIO;
/* 15 */            int i = il1ioo0oooiVar.I00000oOI;
/* 17 */            int i2 = il1ioo0oooiVar.I0000Il00O;
/* 22 */            iIloloioo0 iiloloioo0 = new iIloloioo0(false);
/* 27 */            iiOlIi0l00ll iiolii0l00ll2 = new iiOlIi0l00ll(iii1iiii);
/* 30 */            Parcel parcelI00Iooi00oi = o0il0li.I00Iooi00oi();
/* 34 */            int i3 = iil0I01i.I00000oIO;
/* 37 */            parcelI00Iooi00oi.writeInt(1);
/* 42 */            int iI00100l0 = lO0IioIooIl.I00100l0(20293, parcelI00Iooi00oi);
/* 46 */            lO0IioIooIl.I000OiO(parcelI00Iooi00oi, 1, str);
/* 51 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 2, 4);
/* 54 */            parcelI00Iooi00oi.writeInt(1);
/* 58 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 3, 4);
/* 61 */            parcelI00Iooi00oi.writeInt(i);
/* 64 */            if (iiolii0l00ll == null) {
/* 66 */                iiolii0l00ll = null;
                    }
/* 67 */            lO0IioIooIl.I0001Ioi1lo(parcelI00Iooi00oi, 4, iiolii0l00ll);
/* 71 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 5, 4);
/* 74 */            parcelI00Iooi00oi.writeInt(i2);
/* 78 */            lO0IioIooIl.I000oI1ioi(parcelI00Iooi00oi, 6, 4);
/* 81 */            parcelI00Iooi00oi.writeInt(0);
/* 85 */            lO0IioIooIl.I000OOo1O(parcelI00Iooi00oi, 7, iiloloioo0, 0);
/* 88 */            lO0IioIooIl.I00100o1O0lo(iI00100l0, parcelI00Iooi00oi);
/* 91 */            parcelI00Iooi00oi.writeStrongBinder(iiolii0l00ll2);
/* 94 */            Parcel parcelI00O0i0ii = o0il0li.I00O0i0ii(2, parcelI00Iooi00oi);
/* 98 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 102 */           if (strongBinder != null) {
/* 107 */               IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
/* 121 */               loiiooo1l = iInterfaceQueryLocalInterface instanceof liiiO1I1IlI ? (liiiO1I1IlI) iInterfaceQueryLocalInterface : new lOiIOoo1l(strongBinder);
                    }
/* 124 */           parcelI00O0i0ii.recycle();
/* 408 */           return loiiooo1l;
                }

                public final o0Il0li I0000Il00O(l0IIolOoi0I l0iiolooi0i) {
                    o0Il0li o0il0li;
/* 3 */             il11O1OlI il11o1oliI00000oIO = this.I00000oOI.I00000oIO();
/* 7 */             io100oIo io100oio = (io100oIo) l0iiolooi0i;
/* 9 */             Parcel parcelI00Iooi00oi = io100oio.I00Iooi00oi();
/* 13 */            int i = iil0I01i.I00000oIO;
/* 16 */            parcelI00Iooi00oi.writeInt(1);
/* 20 */            il11o1oliI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 25 */            Parcel parcelI00O0i0ii = io100oio.I00O0i0ii(15, parcelI00Iooi00oi);
/* 29 */            IBinder strongBinder = parcelI00O0i0ii.readStrongBinder();
/* 33 */            if (strongBinder == null) {
/* 35 */                o0il0li = null;
                    } else {
/* 39 */                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMagicRewriteService");
/* 54 */                o0il0li = iInterfaceQueryLocalInterface instanceof o0Il0li ? (o0Il0li) iInterfaceQueryLocalInterface : new o0Il0li(strongBinder, "com.google.android.apps.aicore.aidl.IMagicRewriteService", 3);
                    }
/* 58 */            parcelI00O0i0ii.recycle();
/* 77 */            return o0il0li;
                }

                public final ListenableFuture I0000O() {
                    ListenableFuture listenableFutureI0000O;
                    iollI00lIIil iolli00liiil;
                    synchronized (this.I0001Ioi1lo) {
                        try {
/* 4 */                     l0I1O010oooi l0i1o010oooi = this.I000II;
/* 8 */                     il0I11I011 il0i11i011 = (il0I11I011) this.I00000oIO;
/* 18 */                    if (l0i1o010oooi == il0i11i011.I00000oIO().I00000oIO() && (iolli00liiil = this.I000O01llI0) != null) {
/* 25 */                        return iolli00liiil;
                            }
/* 29 */                    IOO0o0I1l iOO0o0I1l = this.I0000Il00O;
/* 33 */                    int i = 0;
/* 34 */                    if (il0i11i011.I00io1l) {
/* 39 */                        iOioIII1i ioioiii1i = this.I00000oOI;
/* 41 */                        il0i11i011.I000II();
/* 63 */                        ioii1ol1Oool ioii1ol1ooolI0000Il00O = lioli1IO.I0000Il00O(iollI00lIIil.I000o00OoI0I(il0i11i011.I00000oIO().I00000oIO()), new iilI0iIO010(), iol1IOlOo.I00iOIl);
/* 70 */                        ii1iilOI ii1iiloi = new ii1iilOI(3);
/* 73 */                        ii1iiloi.I00000oOI = ioioiii1i;
/* 75 */                        VarHandle.storeStoreFence();
/* 84 */                        iollI00lIIil iolli00liiilI000o00OoI0I = iollI00lIIil.I000o00OoI0I(lioli1IO.I0000O(ioii1ol1ooolI0000Il00O, ii1iiloi, il0i11i011.I00iOIl));
/* 90 */                        ii1OO0ilo ii1oo0ilo = new ii1OO0ilo(i);
/* 93 */                        ii1oo0ilo.I00000oOI = this;
/* 95 */                        ii1oo0ilo.I0000Il00O = iOO0o0I1l;
/* 97 */                        VarHandle.storeStoreFence();
/* 102 */                       listenableFutureI0000O = lioli1IO.I0000O(iolli00liiilI000o00OoI0I, ii1oo0ilo, this.I0000O);
                            } else {
/* 36 */                        listenableFutureI0000O = l00Il111lO1I.I00iiI;
                            }
/* 106 */                   iollI00lIIil iolli00liiilI000o00OoI0I2 = iollI00lIIil.I000o00OoI0I(listenableFutureI0000O);
/* 112 */                   ii1iilOI ii1iiloi2 = new ii1iilOI(i);
/* 115 */                   ii1iiloi2.I00000oOI = this;
/* 117 */                   VarHandle.storeStoreFence();
/* 120 */                   l01I1iOlI l01i1ioli = this.I0000O;
/* 122 */                   ioiIlo ioiiloI0000O = lioli1IO.I0000O(iolli00liiilI000o00OoI0I2, ii1iiloi2, l01i1ioli);
/* 129 */                   ii1iilOI ii1iiloi3 = new ii1iilOI(1);
/* 132 */                   ii1iiloi3.I00000oOI = this;
/* 134 */                   VarHandle.storeStoreFence();
/* 137 */                   ioiIlo ioiiloI0000O2 = lioli1IO.I0000O(ioiiloI0000O, ii1iiloi3, l01i1ioli);
/* 141 */                   this.I000O01llI0 = ioiiloI0000O2;
/* 151 */                   this.I000II = il0i11i011.I00000oIO().I00000oIO();
/* 155 */                   i1IoOl i1iool = new i1IoOl();
/* 158 */                   i1iool.I00iOIl = this;
/* 160 */                   VarHandle.storeStoreFence();
/* 163 */                   iol1IOlOo iol1ioloo = iol1IOlOo.I00iOIl;
/* 167 */                   iooiio1i0 iooiio1i0Var = new iooiio1i0(i);
/* 170 */                   iooiio1i0Var.I00iiI = ioiiloI0000O2;
/* 172 */                   iooiio1i0Var.I00iiO = i1iool;
/* 174 */                   VarHandle.storeStoreFence();
/* 177 */                   ioiiloI0000O2.addListener(iooiio1i0Var, iol1ioloo);
/* 181 */                   return ioiiloI0000O2;
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }
            }
