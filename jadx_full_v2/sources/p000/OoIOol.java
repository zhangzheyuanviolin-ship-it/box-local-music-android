            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.database.Cursor;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Messenger;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.provider.DocumentsContract;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.common.DownloadCallback;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            import java.util.Set;
            
/* 68 */    public final class OoIOol implements i0O11oO1, OIOolOo, OOooilOIIl0I, ii0O1IOI, IIiOOIoi0, I1OlOl11O0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public OoIOol(IBinder iBinder) throws RemoteException {
/* 3 */             this.I00iOIl = 16;
/* 8 */             String interfaceDescriptor = iBinder.getInterfaceDescriptor();
/* 19 */            if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
/* 26 */                this.I00iiI = new Messenger(iBinder);
/* 28 */                this.I00iiO = null;
                    } else {
/* 37 */                if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
/* 61 */                    Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
/* 77 */                    throw new RemoteException();
                        }
/* 44 */                this.I00iiO = new il1IIi0oI(iBinder);
/* 46 */                this.I00iiI = null;
                    }
                }

                public static OoIOol I000OOo1O(I0Oi111ii i0Oi111ii) {
/* 5 */             OoIOol ooIOol = new OoIOol(9);
/* 14 */            ooIOol.I00iiO = new IIlOoolol0ll(4);
/* 16 */            ooIOol.I00iiI = i0Oi111ii;
/* 18 */            iOl0lOIi11.I00111O();
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return ooIOol;
                }

                public static OoIOol I000OiO(I1ii1o0 i1ii1o0) {
/* 4 */             OoIOol ooIOol = new OoIOol(7);
/* 14 */            ooIOol.I00iiO = new IIlOoolol0ll(17);
/* 16 */            ooIOol.I00iiI = i1ii1o0;
/* 18 */            i1O01oOIoI0I.I000l1();
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return ooIOol;
                }

                public boolean I00000oIO() {
/* 17 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 27 */                    cursorQuery = ((Context) this.I00iiI).getContentResolver().query((Uri) this.I00iiO, new String[]{"document_id"}, null, null, null);
/* 35 */                    return cursorQuery.getCount() > 0;
                        } catch (Exception e) {
/* 60 */                    Log.w("DocumentFile", "Failed query: " + e);
/* 63 */                    il1l0Ioi1ll.I00000oIO(cursorQuery);
/* 16 */                    return false;
                        }
                    } finally {
/* 67 */                il1l0Ioi1ll.I00000oIO(cursorQuery);
                    }
                }

                @Override
                public OillOo0 I00000oOI(iO0iIIoO11 io0iiioo11) {
/* 5 */             OillOo0 oillOo0I001lloI = ((OillOo0) this.I00iiI).I001lloI();
/* 13 */            oillOo0I001lloI.I00IioO0OiOi((String) this.I00iiO, io0iiioo11);
/* 29 */            return oillOo0I001lloI;
                }

                @Override
                public Object I0000Il00O() {
/* 3 */             i0O1I1o i0o1i1o = (i0O1I1o) this.I00iiI;
/* 7 */             Bundle bundle = (Bundle) this.I00iiO;
/* 11 */            int i = bundle.getInt("session_id");
/* 15 */            if (i == 0) {
/* 17 */                return Boolean.TRUE;
                    }
/* 20 */            HashMap map = i0o1i1o.I0000Il00O;
/* 22 */            Integer numValueOf = Integer.valueOf(i);
/* 30 */            if (!map.containsKey(numValueOf)) {
/* 32 */                return Boolean.TRUE;
                    }
/* 48 */            if (((i0O10o1) i0o1i1o.I0000Il00O.get(numValueOf)).I0000Il00O.I0000Il00O == 6) {
/* 50 */                return Boolean.FALSE;
                    }
/* 55 */            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
/* 59 */            if (stringArrayList == null || stringArrayList.isEmpty()) {
/* 110 */               throw new i0O0lI1oiO("Session without pack received.");
                    }
/* 94 */            return Boolean.valueOf(!liIoOlIoI1II.I00000oOI(r0.I0000Il00O.I0000Il00O, bundle.getInt(liIlli0IIoo.I00000oIO("status", stringArrayList.get(0)))));
                }

                public Ooioo0o1l0 I0000O(O00oiI0oo0ol o00oiI0oo0ol) {
                    Ooioo0o1l0 ooioo0o1l0I000O01llI0;
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0O = o00oiI0oo0ol.I0001Ioi1lo;
                    return (ol0O0iI0l0O == null || (ooioo0o1l0I000O01llI0 = lOoliOIOlIO0.I000O01llI0(ol0O0iI0l0O)) == null) ? (Il0oo01OllO0) ((OllO00oiil) this.I00iiI).getValue() : ooioo0o1l0I000O01llI0;
                }

                public O0iIl1 I0000oI00(OoOOiO ooOOiO, O00oiI0oo0ol o00oiI0oo0ol) {
/* 3 */             O1I00llOi o1I00llOi = (O1I00llOi) this.I00iiO;
/* 7 */             OoOi0IIool ooOi0IIool = new OoOi0IIool();
/* 10 */            ooOi0IIool.I00000oIO = ooOOiO;
/* 12 */            ooOi0IIool.I00000oOI = o00oiI0oo0ol;
/* 14 */            VarHandle.storeStoreFence();
/* 21 */            return (O0iIl1) o1I00llOi.invoke(ooOi0IIool);
                }

                public OoIOol[] I0001Ioi1lo() {
/* 4 */             Context context = (Context) this.I00iiI;
/* 6 */             ContentResolver contentResolver = context.getContentResolver();
/* 12 */            Uri uri = (Uri) this.I00iiO;
/* 18 */            Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
/* 24 */            ArrayList arrayList = new ArrayList();
/* 27 */            int i = 0;
/* 28 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 38 */                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
/* 46 */                    while (cursorQuery.moveToNext()) {
/* 56 */                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                            }
                            try {
/* 66 */                        IIl001iO0Io.I001i1lo1io(cursorQuery);
                            } catch (RuntimeException e) {
/* 72 */                        throw e;
                            }
                        } catch (Exception e2) {
/* 92 */                    Log.w("DocumentFile", "Failed query: " + e2);
/* 95 */                    if (cursorQuery != null) {
                                try {
/* 97 */                            IIl001iO0Io.I001i1lo1io(cursorQuery);
                                } catch (RuntimeException e3) {
/* 103 */                           throw e3;
                                }
                            }
                        }
/* 114 */               Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
/* 117 */               OoIOol[] ooIOolArr = new OoIOol[uriArr.length];
/* 121 */               for (int i2 = 0; i2 < uriArr.length; i2++) {
/* 130 */                   ooIOolArr[i2] = new OoIOol(i, context, uriArr[i2]);
                        }
/* 135 */               return ooIOolArr;
                    } catch (Throwable th) {
/* 136 */               if (cursorQuery == null) {
/* 245 */                   throw th;
                        }
                        try {
/* 138 */                   IIl001iO0Io.I001i1lo1io(cursorQuery);
/* 245 */                   throw th;
                        } catch (RuntimeException e4) {
/* 144 */                   throw e4;
                        } catch (Exception unused) {
/* 245 */                   throw th;
                        }
                    }
                }

                public void I000II(Throwable th) {
/* 3 */             lIl1O1li lil1o1li = (lIl1O1li) this.I00iiO;
/* 5 */             lil1o1li.I010II();
/* 10 */            l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 12 */            boolean z = false;
/* 13 */            lil1o1li.I00l0I0l0lO1 = false;
/* 23 */            lil1o1li.I011lOIoo0l().add((li1l0Iiiii) this.I00iiI);
/* 41 */            int i = 1;
/* 42 */            if (lil1o1li.I00l0OO0IO > ((Integer) iol1II1ii1i.I00ll1.I00000oIO(null)).intValue()) {
/* 44 */                lil1o1li.I00l0OO0IO = 1;
/* 46 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 48 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 75 */                l01o0io1ooo0.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(l0olllo1i.I000iOII().I010l1O()), "registerTriggerAsync failed. May try later. App ID, throwable", l01O0IO1ooO0.I010ioo(th.toString()));
/* 78 */                return;
                    }
/* 79 */            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 81 */            l0olllO1i.I000II(l01o0io1ooo02);
/* 118 */           l01o0io1ooo02.I00l0I0l0lO1.I0000oI00("registerTriggerAsync failed. App ID, delay in seconds, throwable", l01O0IO1ooO0.I010ioo(l0olllo1i.I000iOII().I010l1O()), l01O0IO1ooO0.I010ioo(String.valueOf(lil1o1li.I00l0OO0IO)), l01O0IO1ooO0.I010ioo(th.toString()));
/* 121 */           int i2 = lil1o1li.I00l0OO0IO;
/* 123 */           l1o00OIlII l1o00oilii = lil1o1li.I00li1OI;
/* 125 */           if (l1o00oilii == null) {
/* 129 */               l1o00oilii = new l1o00OIlII(lil1o1li, l0olllo1i, i, z);
/* 132 */               lil1o1li.I00li1OI = l1o00oilii;
                    }
/* 138 */           l1o00oilii.I00000oOI(i2 * 1000);
/* 141 */           int i3 = lil1o1li.I00l0OO0IO;
/* 144 */           lil1o1li.I00l0OO0IO = i3 + i3;
                }

                public Oilolol11I I000O01llI0(OoOilII0 ooOilII0, List list, O00oiI0oo0ol o00oiI0oo0ol) {
                    Ooioo0o1l0 ooioo0o1l0I0000O;
/* 7 */             OoOiiO01illo ooOiiO01illo = ooOilII0.I00000oIO;
/* 11 */            Oilolol11I oilolol11I = new Oilolol11I();
/* 14 */            Iterator it = list.iterator();
/* 22 */            if (it.hasNext()) {
/* 28 */                O0iIl1 o0iIl1 = (O0iIl1) it.next();
/* 34 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 40 */                if (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) {
/* 42 */                    Set set = o00oiI0oo0ol.I0000oI00;
/* 44 */                    Ooioo0o1l0 ooioo0o1l0I00l0OO0IO = o0iIl1.I00l0OO0IO();
/* 54 */                    if (ooioo0o1l0I00l0OO0IO instanceof IlOIOIi00io) {
/* 57 */                        IlOIOIi00io ilOIOIi00io = (IlOIOIi00io) ooioo0o1l0I00l0OO0IO;
/* 59 */                        Ol0O0iI0l0O ol0O0iI0l0OI0000O = ilOIOIi00io.I00iiI;
/* 73 */                        if (!ol0O0iI0l0OI0000O.I00iOIl().I000II().isEmpty() && ol0O0iI0l0OI0000O.I00iOIl().I00100o1O0lo() != null) {
/* 90 */                            List<OoOOiO> listI000II = ol0O0iI0l0OI0000O.I00iOIl().I000II();
/* 102 */                           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 113 */                           for (OoOOiO ooOOiO : listI000II) {
/* 133 */                               OoOi1Ol olIo1I = (OoOi1Ol) IOOi0Ool1i.I00II0oii1o(ooOOiO.getIndex(), o0iIl1.I00OIl());
/* 145 */                               boolean z = set != null && set.contains(ooOOiO);
/* 146 */                               if (olIo1I == null || z || ooOiiO01illo.I0000O(olIo1I.I00000oOI()) == null) {
/* 162 */                                   olIo1I = new OlIo1I(ooOOiO);
                                        }
/* 165 */                               arrayList.add(olIo1I);
                                    }
/* 169 */                           ol0O0iI0l0OI0000O = lOoil0Io0Io.I0000O(ol0O0iI0l0OI0000O, arrayList, null, 2);
                                }
/* 173 */                       Ol0O0iI0l0O ol0O0iI0l0OI0000O2 = ilOIOIi00io.I00iiO;
/* 187 */                       if (!ol0O0iI0l0OI0000O2.I00iOIl().I000II().isEmpty() && ol0O0iI0l0OI0000O2.I00iOIl().I00100o1O0lo() != null) {
/* 204 */                           List<OoOOiO> listI000II2 = ol0O0iI0l0OI0000O2.I00iOIl().I000II();
/* 216 */                           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI000II2, 10));
/* 227 */                           for (OoOOiO ooOOiO2 : listI000II2) {
/* 247 */                               OoOi1Ol olIo1I2 = (OoOi1Ol) IOOi0Ool1i.I00II0oii1o(ooOOiO2.getIndex(), o0iIl1.I00OIl());
/* 259 */                               boolean z2 = set != null && set.contains(ooOOiO2);
/* 260 */                               if (olIo1I2 == null || z2 || ooOiiO01illo.I0000O(olIo1I2.I00000oOI()) == null) {
/* 276 */                                   olIo1I2 = new OlIo1I(ooOOiO2);
                                        }
/* 279 */                               arrayList2.add(olIo1I2);
                                    }
/* 283 */                           ol0O0iI0l0OI0000O2 = lOoil0Io0Io.I0000O(ol0O0iI0l0OI0000O2, arrayList2, null, 2);
                                }
/* 287 */                       ooioo0o1l0I0000O = l0loOIIo0iOo.I00000oIO(ol0O0iI0l0OI0000O, ol0O0iI0l0OI0000O2);
                            } else {
/* 295 */                       if (!(ooioo0o1l0I00l0OO0IO instanceof Ol0O0iI0l0O)) {
/* 432 */                           I000II.I00000oIO();
/* 50 */                            return null;
                                }
/* 298 */                       Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) ooioo0o1l0I00l0OO0IO;
/* 312 */                       if (ol0O0iI0l0O.I00iOIl().I000II().isEmpty() || ol0O0iI0l0O.I00iOIl().I00100o1O0lo() == null) {
/* 413 */                           ooioo0o1l0I0000O = ol0O0iI0l0O;
                                } else {
/* 329 */                           List<OoOOiO> listI000II3 = ol0O0iI0l0O.I00iOIl().I000II();
/* 341 */                           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI000II3, 10));
/* 352 */                           for (OoOOiO ooOOiO3 : listI000II3) {
/* 372 */                               OoOi1Ol olIo1I3 = (OoOi1Ol) IOOi0Ool1i.I00II0oii1o(ooOOiO3.getIndex(), o0iIl1.I00OIl());
/* 384 */                               boolean z3 = set != null && set.contains(ooOOiO3);
/* 385 */                               if (olIo1I3 == null || z3 || ooOiiO01illo.I0000O(olIo1I3.I00000oOI()) == null) {
/* 401 */                                   olIo1I3 = new OlIo1I(ooOOiO3);
                                        }
/* 404 */                               arrayList3.add(olIo1I3);
                                    }
/* 408 */                           ooioo0o1l0I0000O = lOoil0Io0Io.I0000O(ol0O0iI0l0O, arrayList3, null, 2);
                                }
                            }
/* 428 */                   oilolol11I.add(ooOilII0.I0001Ioi1lo(lOoll01ll0I.I00000oOI(ooioo0o1l0I0000O, lOoll01ll0I.I00000oIO(ooioo0o1l0I00l0OO0IO)), Ooo0Ioii0o0.I00ilI0I1));
                        } else if (iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO) {
/* 440 */                   Set set2 = o00oiI0oo0ol.I0000oI00;
/* 442 */                   if (set2 == null || !set2.contains(iOIiO1lIl0lI00100o1O0lo)) {
/* 469 */                       oilolol11I.addAll(I000O01llI0(ooOilII0, ((OoOOiO) iOIiO1lIl0lI00100o1O0lo).getUpperBounds(), o00oiI0oo0ol));
                            } else {
/* 455 */                       oilolol11I.add(I0000O(o00oiI0oo0ol));
                            }
                        }
                    }
/* 472 */           return Oio0lI.I00000oIO(oilolol11I);
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 12 */            i0i000l1o i0i000l1oVar = new i0i000l1o((i0i0iII) this.I00iiI, (OloIlI0ll) obj2, 1);
/* 19 */            i0OoOOOI00l i0oooooi00l = (i0OoOOOI00l) ((i0i0iOi) obj).I000l1();
/* 23 */            I11OiiIO i11OiiIO = (I11OiiIO) this.I00iiO;
/* 25 */            Parcel parcelI0000oI00 = i0oooooi00l.I0000oI00();
/* 29 */            int i = i0OlOO.I00000oIO;
/* 31 */            parcelI0000oI00.writeStrongBinder(i0i000l1oVar);
/* 34 */            i0OlOO.I00000oOI(parcelI0000oI00, i11OiiIO);
/* 38 */            parcelI0000oI00.writeStrongBinder(null);
/* 42 */            i0oooooi00l.I00IoIO0lI(2, parcelI0000oI00);
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 3 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 11:
/* 57 */                    ilIoii01i ilioii01i = (ilIoii01i) this.I00iiI;
                            try {
/* 68 */                        liiiOiOilI0l liiioioili0lI00000oIO = ilioii01i.I00000oIO(((il0Oi1i1II) this.I00iiO).I00000oIO, new iiOli1O(iIiOOI));
/* 74 */                        iiIii011OlI iiiii011oli = new iiIii011OlI(0);
/* 77 */                        iiiii011oli.I00iiI = liiioioili0lI00000oIO;
/* 79 */                        VarHandle.storeStoreFence();
/* 84 */                        iIiOOI.I00000oIO(iiiii011oli, ilioii01i.I0000O);
/* 87 */                        return "prepareInferenceEngineFuture";
                            } catch (RemoteException e) {
/* 109 */                       iIiOOI.I0000O(iOiIOO1ll.I0000Il00O(6, e, "Failed to prepare inference engine"));
/* 112 */                       return null;
                            } catch (RuntimeException e2) {
/* 100 */                       iIiOOI.I0000O(iOiIOO1ll.I0000Il00O(0, e2, "Failed to prepare inference engine"));
/* 112 */                       return null;
                            }
                        default:
/* 10 */                    o1I0I0O o1i0i0o = (o1I0I0O) this.I00iiI;
/* 28 */                    OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(o1i0i0o.I000II, null, null, new i00Iooii0i(o1i0i0o, iIiOOI, (DownloadCallback) this.I00iiO, null, 5), 3);
/* 34 */                    o10iioooOi0 o10iiooooi0 = new o10iioooOi0(i);
/* 37 */                    o10iiooooi0.I00iiI = olIl0iI0000O;
/* 39 */                    VarHandle.storeStoreFence();
/* 44 */                    iIiOOI.I00000oIO(o10iiooooi0, o1i0i0o.I0001Ioi1lo);
/* 47 */                    return "download";
                    }
                }

                @Override
                public ListenableFuture call() {
/* 3 */             loilO0l loilo0l = (loilO0l) this.I00iiO;
/* 9 */             String strValueOf = String.valueOf(loilo0l.I00000oIO);
/* 13 */            Io1Oioii1111 io1Oioii1111 = loilo0l.I000O01llI0;
/* 15 */            String strConcat = "Initialize ".concat(strValueOf);
/* 19 */            io1Oioii1111.getClass();
/* 22 */            o0OI1ilol0l o0oi1ilol0lI00100l0 = Io1Oioii1111.I00100l0(strConcat);
                    try {
                        synchronized (loilo0l.I000II) {
                            try {
/* 33 */                        if (((List) this.I00iiI) == null) {
/* 37 */                            this.I00iiI = loilo0l.I000OOo1O;
/* 41 */                            loilo0l.I000OOo1O = Collections.EMPTY_LIST;
                                }
                            } catch (Throwable th) {
/* 152 */                       throw th;
                            }
                        }
/* 57 */                ArrayList arrayList = new ArrayList(((List) this.I00iiI).size());
/* 64 */                loilO0l loilo0l2 = (loilO0l) this.I00iiO;
/* 66 */                loooIloil loooiloil = new loooIloil();
/* 69 */                loooiloil.I00000oIO = loilo0l2;
/* 71 */                VarHandle.storeStoreFence();
/* 78 */                Iterator it = ((List) this.I00iiI).iterator();
/* 86 */                while (it.hasNext()) {
                            try {
/* 98 */                        arrayList.add(((I1Oll0OOO) it.next()).apply(loooiloil));
                            } catch (Exception e) {
/* 109 */                       arrayList.add(IlloOoiiO.I00000oOI(e));
                            }
                        }
/* 112 */               IoillO0OOoo ioillO0OOooI000o00OoI0I = IoillO0OOoo.I000o00OoI0I(arrayList);
/* 120 */               Io11llo0i io11llo0i = new Io11llo0i(17);
/* 123 */               io11llo0i.I00000oOI = this;
/* 125 */               VarHandle.storeStoreFence();
/* 131 */               IOOoo0o0Io iOOoo0o0Io = new IOOoo0o0Io(ioillO0OOooI000o00OoI0I, true);
/* 139 */               iOOoo0o0Io.I00lll10 = new IOOoiII1ioO(iOOoo0o0Io, io11llo0i);
/* 141 */               iOOoo0o0Io.I0010I0i();
/* 144 */               o0oi1ilol0lI00100l0.I00000oIO(iOOoo0o0Io);
/* 147 */               o0oi1ilol0lI00100l0.close();
/* 150 */               return iOOoo0o0Io;
                    } catch (Throwable th2) {
                        try {
/* 153 */                   o0oi1ilol0lI00100l0.close();
                        } catch (Throwable th3) {
/* 158 */                   th2.addSuppressed(th3);
                        }
/* 245 */               throw th2;
                    }
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 3 */             i0Oii0oo1i i0oii0oo1i = (i0Oii0oo1i) this.I00iiI;
/* 7 */             OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00iiO;
                    synchronized (i0oii0oo1i.I0001Ioi1lo) {
/* 14 */                i0oii0oo1i.I0000oI00.remove(oloIlI0ll);
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 2:
/* 42 */                    return "Bounds{lower=" + ((Ioo0l0I) this.I00iiI) + " upper=" + ((Ioo0l0I) this.I00iiO) + "}";
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 69 */        public OoIOol(int i, Object obj, Object obj2) {
/* 70 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                }

/* 70 */        public OoIOol(int i) {
/* 71 */            this.I00iOIl = i;
                }

/* 71 */        public OoIOol(iolOOiI iolooii) {
                    this.I00iOIl = 1;
/* 73 */            O1I0OloI o1I0OloI = new O1I0OloI("Type parameter upper bound erasure results");
/* 75 */            O0l1iloO o0l1iloO = new O0l1iloO(8);
                    o0l1iloO.I00iiI = this;
/* 76 */            VarHandle.storeStoreFence();
/* 78 */            this.I00iiI = new OllO00oiil(o0l1iloO);
/* 80 */            OiI0lII1i oiI0lII1i = new OiI0lII1i(5);
                    oiI0lII1i.I00iiI = this;
/* 81 */            VarHandle.storeStoreFence();
                    this.I00iiO = o1I0OloI.I00000oOI(oiI0lII1i);
                }
            }
