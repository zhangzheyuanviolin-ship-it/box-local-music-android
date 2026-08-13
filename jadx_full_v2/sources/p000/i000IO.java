            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.Process;
            import android.os.RemoteException;
            import android.util.SparseIntArray;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicLong;
            
/* 9 */     public final class i000IO implements i0O11oO1, i0Ii0I1ll, ii0O1IOI, IIiOOIoi0, OOooilOIIl0I, lloO1Oolo, I1OlOl11O0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public i000IO(int i, Object obj, Object obj2) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = obj2;
                }

                public static i000IO I000II(I1ii1o0 i1ii1o0) {
/* 4 */             i000IO i000io = new i000IO(5);
/* 14 */            i000io.I00iiO = new IIlOoolol0ll(16);
/* 16 */            i000io.I00iiI = i1ii1o0;
/* 18 */            i1O01Ill.I000OOo1O();
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return i000io;
                }

                @Override
                public Object I00000oIO(OillOo0 oillOo0) throws IOException {
/* 3 */             Uri uri = (Uri) oillOo0.I00ilI0I1;
/* 5 */             AtomicLong atomicLong = loIOIl1li.I00000oIO;
/* 7 */             int iMyPid = Process.myPid();
/* 15 */            long id = Thread.currentThread().getId();
/* 19 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 25 */            long andIncrement = loIOIl1li.I00000oIO.getAndIncrement();
/* 33 */            int length = String.valueOf(iMyPid).length();
/* 41 */            int length2 = String.valueOf(id).length();
/* 72 */            StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
/* 77 */            sb.append(".mobstore_tmp-");
/* 80 */            sb.append(iMyPid);
/* 85 */            sb.append("-");
/* 88 */            sb.append(id);
/* 91 */            sb.append("-");
/* 94 */            sb.append(jCurrentTimeMillis);
/* 97 */            sb.append("-");
/* 100 */           sb.append(andIncrement);
/* 127 */           Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
/* 133 */           loIo0iiOoi loio0iiooi = (loIo0iiOoi) oillOo0.I00iiI;
/* 139 */           ArrayList arrayListI00II0Ol1O0l = oillOo0.I00II0Ol1O0l(loio0iiooi.I0000O(uriBuild));
/* 145 */           OoOlO1O0o[] ooOlO1O0oArr = (OoOlO1O0o[]) this.I00iiO;
/* 148 */           if (ooOlO1O0oArr != null) {
/* 152 */               ooOlO1O0oArr[0].I000O01llI0(arrayListI00II0Ol1O0l);
                    }
                    try {
/* 159 */               OutputStream outputStream = (OutputStream) arrayListI00II0Ol1O0l.get(0);
                        try {
/* 165 */                   ((i1ilO0II) this.I00iiI).I00000oOI(outputStream);
/* 170 */                   OoOlO1O0o[] ooOlO1O0oArr2 = (OoOlO1O0o[]) this.I00iiO;
/* 172 */                   if (ooOlO1O0oArr2 != null) {
/* 174 */                       OoOlO1O0o ooOlO1O0o = ooOlO1O0oArr2[0];
/* 180 */                       if (((lo1OoIIlll) ooOlO1O0o.I00iiO) == null) {
/* 210 */                           throw new IOO1IOl1O10("Cannot sync underlying stream");
                                }
/* 186 */                       ((OutputStream) ooOlO1O0o.I00iiI).flush();
/* 199 */                       ((lo1OoIIlll) ooOlO1O0o.I00iiO).I00iOIl.getFD().sync();
                            }
/* 213 */                   outputStream.close();
/* 216 */                   loio0iiooi.I0001Ioi1lo(uriBuild, uri);
/* 219 */                   return null;
                        } finally {
                        }
                    } catch (Exception e) {
                        try {
/* 234 */                   loio0iiooi.I0000oI00(uriBuild);
                        } catch (FileNotFoundException unused) {
                        }
/* 239 */               if (e instanceof IOException) {
/* 243 */                   throw ((IOException) e);
                        }
/* 437 */               throw new IOException(e);
                    }
                }

                @Override
                public OillOo0 I00000oOI(iO0iIIoO11 io0iiioo11) {
/* 5 */             OillOo0 oillOo0I001lloI = ((OillOo0) this.I00iiI).I001lloI();
/* 11 */            String str = (String) this.I00iiO;
/* 13 */            oillOo0I001lloI.I00IioO0OiOi(str, io0iiioo11);
/* 22 */            ((HashMap) oillOo0I001lloI.I00ilI0I1).put(str, Boolean.TRUE);
/* 29 */            return oillOo0I001lloI;
                }

                @Override
                public Object I0000Il00O() {
                    String str;
                    boolean z;
                    switch (this.I00iOIl) {
                        case 2:
/* 46 */                    i0O1I1o i0o1i1o = (i0O1I1o) this.I00iiI;
/* 50 */                    Bundle bundle = (Bundle) this.I00iiO;
/* 54 */                    int i = bundle.getInt("session_id");
/* 58 */                    if (i == 0) {
/* 60 */                        return Boolean.FALSE;
                            }
/* 64 */                    HashMap map = i0o1i1o.I0000Il00O;
/* 66 */                    i0IOo0i0 i0ioo0i0 = i0o1i1o.I0000oI00;
/* 68 */                    Integer numValueOf = Integer.valueOf(i);
/* 76 */                    byte b = 0;
/* 77 */                    String str2 = "chunk_intents";
/* 82 */                    if (map.containsKey(numValueOf)) {
/* 88 */                        i0O1001OIi i0o1001oii = i0o1i1o.I00000oIO(i).I0000Il00O;
/* 92 */                        String str3 = (String) i0o1001oii.I0000O;
/* 98 */                        int i2 = bundle.getInt(liIlli0IIoo.I00000oIO("status", str3));
/* 102 */                       int i3 = i0o1001oii.I0000Il00O;
/* 111 */                       if (liIoOlIoI1II.I00000oOI(i3, i2)) {
/* 125 */                           i0O1I1o.I0001Ioi1lo.I00000oIO("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i3));
/* 128 */                           int i4 = i0o1001oii.I0000Il00O;
/* 130 */                           if (i4 == 4) {
/* 138 */                               ((i0OiOI1) i0ioo0i0.I0000Il00O()).I0000Il00O(i, str3);
                                    } else if (i4 == 5) {
/* 151 */                               ((i0OiOI1) i0ioo0i0.I0000Il00O()).I00000oOI(i);
                                    } else if (i4 == 6) {
/* 172 */                               ((i0OiOI1) i0ioo0i0.I0000Il00O()).I0000oI00(Arrays.asList(str3));
                                    }
                                } else {
/* 177 */                           i0o1001oii.I0000Il00O = i2;
/* 179 */                           if (i2 == 5 || i2 == 6 || i2 == 4) {
/* 260 */                               O1I1OO o1i1oo = new O1I1OO(16, b);
/* 263 */                               o1i1oo.I00iiO = i0o1i1o;
/* 265 */                               o1i1oo.I00iiI = i;
/* 267 */                               VarHandle.storeStoreFence();
/* 270 */                               i0o1i1o.I00000oOI(o1i1oo);
/* 275 */                               i0o1i1o.I00000oOI.I00000oOI(str3);
                                    } else {
/* 190 */                               Iterator it = ((ArrayList) i0o1001oii.I0001Ioi1lo).iterator();
/* 198 */                               while (it.hasNext()) {
/* 204 */                                   i0O11Il0Oo i0o11il0oo = (i0O11Il0Oo) it.next();
/* 212 */                                   ArrayList parcelableArrayList = bundle.getParcelableArrayList(liIlli0IIoo.I00000oOI("chunk_intents", str3, i0o11il0oo.I00000oIO));
/* 216 */                                   if (parcelableArrayList != null) {
/* 223 */                                       for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
/* 229 */                                           if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
/* 251 */                                               ((i0O0olIoi1) i0o11il0oo.I0000O.get(i5)).I00000oIO = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
/* 282 */                       ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
/* 286 */                       if (stringArrayList == null || stringArrayList.isEmpty()) {
/* 574 */                           throw new i0O0lI1oiO("Session without pack received.");
                                }
/* 294 */                       String str4 = stringArrayList.get(0);
/* 306 */                       long j = bundle.getLong(liIlli0IIoo.I00000oIO("pack_version", str4));
/* 318 */                       String string = bundle.getString(liIlli0IIoo.I00000oIO("pack_version_tag", str4), "");
/* 326 */                       int i6 = bundle.getInt(liIlli0IIoo.I00000oIO("status", str4));
/* 336 */                       long j2 = bundle.getLong(liIlli0IIoo.I00000oIO("total_bytes_to_download", str4));
/* 346 */                       List<String> stringArrayList2 = bundle.getStringArrayList(liIlli0IIoo.I00000oIO("slice_ids", str4));
/* 352 */                       ArrayList arrayList = new ArrayList();
/* 355 */                       if (stringArrayList2 == null) {
/* 357 */                           stringArrayList2 = Collections.EMPTY_LIST;
                                }
/* 367 */                       for (String str5 : stringArrayList2) {
/* 379 */                           List parcelableArrayList2 = bundle.getParcelableArrayList(liIlli0IIoo.I00000oOI(str2, str4, str5));
/* 385 */                           ArrayList arrayList2 = new ArrayList();
/* 388 */                           if (parcelableArrayList2 == null) {
/* 390 */                               parcelableArrayList2 = Collections.EMPTY_LIST;
                                    }
/* 392 */                           Iterator it2 = parcelableArrayList2.iterator();
/* 400 */                           while (it2.hasNext()) {
/* 408 */                               if (((Intent) it2.next()) != null) {
/* 410 */                                   str = str2;
/* 412 */                                   z = true;
                                        } else {
/* 416 */                                   str = str2;
/* 418 */                                   z = false;
                                        }
/* 413 */                               Iterator it3 = it2;
/* 422 */                               i0O0olIoi1 i0o0olioi1 = new i0O0olIoi1();
/* 425 */                               i0o0olioi1.I00000oIO = z;
/* 427 */                               arrayList2.add(i0o0olioi1);
/* 430 */                               it2 = it3;
/* 432 */                               str2 = str;
                                    }
/* 435 */                           String str6 = str2;
/* 443 */                           String string2 = bundle.getString(liIlli0IIoo.I00000oOI("uncompressed_hash_sha256", str4, str5));
/* 453 */                           long j3 = bundle.getLong(liIlli0IIoo.I00000oOI("uncompressed_size", str4, str5));
/* 464 */                           int i7 = bundle.getInt(liIlli0IIoo.I00000oOI("patch_format", str4, str5), 0);
/* 506 */                           arrayList.add(i7 != 0 ? new i0O11Il0Oo(str5, string2, j3, arrayList2, 0, i7) : new i0O11Il0Oo(str5, string2, j3, arrayList2, bundle.getInt(liIlli0IIoo.I00000oOI("compression_format", str4, str5), 0), 0));
/* 510 */                           str2 = str6;
                                }
/* 517 */                       i0O1001OIi i0o1001oii2 = new i0O1001OIi();
/* 520 */                       i0o1001oii2.I0000O = str4;
/* 522 */                       i0o1001oii2.I00000oIO = j;
/* 524 */                       i0o1001oii2.I0000Il00O = i6;
/* 526 */                       i0o1001oii2.I00000oOI = j2;
/* 528 */                       i0o1001oii2.I0001Ioi1lo = arrayList;
/* 530 */                       i0o1001oii2.I0000oI00 = string;
/* 532 */                       VarHandle.storeStoreFence();
/* 539 */                       int i8 = bundle.getInt("app_version_code");
/* 543 */                       i0O10o1 i0o10o1 = new i0O10o1();
/* 546 */                       i0o10o1.I00000oIO = i;
/* 548 */                       i0o10o1.I00000oOI = i8;
/* 550 */                       i0o10o1.I0000Il00O = i0o1001oii2;
/* 552 */                       VarHandle.storeStoreFence();
/* 561 */                       i0o1i1o.I0000Il00O.put(Integer.valueOf(i), i0o10o1);
                            }
/* 564 */                   return Boolean.TRUE;
                        default:
/* 12 */                    Object objI0000Il00O = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 26 */                    i0IOo0i0 i0ioo0i02 = new i0IOo0i0(liIllOil01.I00000oIO((Oi00IilOloo0) this.I00iiO));
/* 33 */                    i0OIIIll i0oiiill = new i0OIIIll();
/* 36 */                    i0oiiill.I00000oIO = (i0Il00O1) objI0000Il00O;
/* 38 */                    i0oiiill.I00000oOI = i0ioo0i02;
/* 40 */                    VarHandle.storeStoreFence();
/* 43 */                    return i0oiiill;
                    }
                }

                public void I0000O(OlO0000lIOII olO0000lIOII, OlilOlOiI olilOlOiI) {
/* 3 */             OloIli oloIli = (OloIli) this.I00iiO;
/* 9 */             I00ioIO i00ioIO = new I00ioIO(16);
/* 12 */            i00ioIO.I00iiI = this;
/* 14 */            i00ioIO.I00iiO = olO0000lIOII;
/* 16 */            i00ioIO.I00iio = olilOlOiI;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            oloIli.I0000O(i00ioIO);
                }

                public void I0000oI00(OlO0000lIOII olO0000lIOII, int i) {
/* 15 */            ((OloIli) this.I00iiO).I0000O(new OlOIIOi0((OOIo1i0) this.I00iiI, olO0000lIOII, false, i));
                }

                public int I0001Ioi1lo(Context context, Io0OoIoOo io0OoIoOo) {
                    int i;
                    int iI00000oOI;
/* 1 */             lII0I0I000I.I000II(context);
/* 4 */             lII0I0I000I.I000II(io0OoIoOo);
/* 7 */             int iI000OOo1O = io0OoIoOo.I000OOo1O();
/* 13 */            SparseIntArray sparseIntArray = (SparseIntArray) this.I00iiI;
                    synchronized (sparseIntArray) {
/* 17 */                i = sparseIntArray.get(iI000OOo1O, -1);
                    }
/* 22 */            if (i != -1) {
/* 24 */                return i;
                    }
/* 28 */            SparseIntArray sparseIntArray2 = (SparseIntArray) this.I00iiI;
                    synchronized (sparseIntArray2) {
/* 31 */                iI00000oOI = 0;
/* 32 */                int i2 = 0;
                        while (true) {
                            try {
/* 37 */                        if (i2 >= sparseIntArray2.size()) {
/* 57 */                            iI00000oOI = -1;
                                    break;
                                }
/* 39 */                        int iKeyAt = sparseIntArray2.keyAt(i2);
/* 43 */                        if (iKeyAt > iI000OOo1O && sparseIntArray2.get(iKeyAt) == 0) {
                                    break;
                                }
/* 54 */                        i2++;
                            } catch (Throwable th) {
/* 74 */                        throw th;
                            }
                        }
/* 58 */                if (iI00000oOI == -1) {
/* 64 */                    iI00000oOI = ((Io0iI1l01il) this.I00iiO).I00000oOI(context, iI000OOo1O);
                        }
/* 68 */                sparseIntArray2.put(iI000OOo1O, iI00000oOI);
                    }
/* 72 */            return iI00000oOI;
                }

                @Override
                public void accept(Object obj, Object obj2) {
                    int i;
/* 3 */             i0i01Ii0iII i0i01ii0iii = (i0i01Ii0iII) this.I00iiI;
/* 7 */             il1I0l il1i0l = (il1I0l) obj;
/* 11 */            l0o1lloI l0o1lloi = new l0o1lloI(i0i01ii0iii, (OloIlI0ll) obj2);
/* 14 */            Context context = i0i01ii0iii.I00000oIO;
                    try {
/* 29 */                i = i01l1OO001.I00000oIO(context).I0000Il00O(0, context.getPackageName()).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 32 */                i = 0;
                    }
/* 35 */            OOoioIi1IOio oOoioIi1IOio = (OOoioIi1IOio) this.I00iiO;
/* 37 */            oOoioIi1IOio.I00ilO0 = i;
/* 43 */            ilii00lO1Oo ilii00lo1oo = (ilii00lO1Oo) il1i0l.I000l1();
/* 49 */            IOiIOIII0io iOiIOIII0io = new IOiIOIII0io(-1, -1, 0, true);
/* 52 */            Parcelable.Creator<I11Oioio> creator = I11Oioio.CREATOR;
/* 56 */            I11Oioio i11Oioio = new I11Oioio(iOiIOIII0io, false);
/* 59 */            i11Oioio.I00iiO = false;
/* 61 */            boolean z = i11Oioio.I00iiO;
/* 67 */            I11Oioio i11Oioio2 = new I11Oioio(i11Oioio.I00iOIl, true);
/* 70 */            i11Oioio2.I00iiO = z;
/* 72 */            Parcel parcelObtain = Parcel.obtain();
/* 78 */            parcelObtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
/* 81 */            int i2 = iil1O1oI0O.I00000oIO;
/* 83 */            parcelObtain.writeStrongBinder(l0o1lloi);
/* 86 */            parcelObtain.writeInt(1);
/* 89 */            oOoioIi1IOio.writeToParcel(parcelObtain, 0);
/* 92 */            parcelObtain.writeInt(1);
/* 95 */            i11Oioio2.writeToParcel(parcelObtain, 0);
/* 98 */            Parcel parcelObtain2 = Parcel.obtain();
                    try {
/* 104 */               ilii00lo1oo.I000II.transact(1, parcelObtain, parcelObtain2, 0);
/* 107 */               parcelObtain2.readException();
                    } finally {
/* 118 */               parcelObtain.recycle();
/* 121 */               parcelObtain2.recycle();
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 7 */             ilIoi0 ilioi0 = (ilIoi0) this.I00iiI;
                    try {
/* 19 */                liiiO1I1IlI liiio1i1iliI00000oIO = ilioi0.I00000oIO(((il0Oi10O1) this.I00iiO).I00000oIO, new iiOlIi0l00ll(iIiOOI));
/* 25 */                iiIiOlII01o1 iiiiolii01o1 = new iiIiOlII01o1(0);
/* 28 */                iiiiolii01o1.I00iiI = liiio1i1iliI00000oIO;
/* 30 */                VarHandle.storeStoreFence();
/* 35 */                iIiOOI.I00000oIO(iiiiolii01o1, ilioi0.I0000O);
/* 38 */                return "prepareInferenceEngineFuture";
                    } catch (RemoteException e) {
/* 58 */                iIiOOI.I0000O(iOiI1oOo1l.I0000Il00O(6, e, "Failed to prepare inference engine"));
/* 61 */                return null;
                    } catch (RuntimeException e2) {
/* 49 */                iIiOOI.I0000O(iOiI1oOo1l.I0000Il00O(0, e2, "Failed to prepare inference engine"));
/* 61 */                return null;
                    }
                }

                @Override
                public ListenableFuture call() {
/* 9 */             o0OllIoI o0ollioiI00000oOI = o0IOOIili01o.I00000oOI(o0IOOIili01o.I0000Il00O(), (o0OllIoI) this.I00iiI);
                    try {
/* 17 */                return ((I1OlOl11O0) this.I00iiO).call();
                    } finally {
                    }
                }

                public String toString() {
/* 8 */             String str = "";
                    switch (this.I00iOIl) {
                        case 6:
/* 145 */                   StringBuilder sb = new StringBuilder(32);
/* 152 */                   sb.append((String) this.I00iiI);
/* 157 */                   sb.append('{');
/* 166 */                   OoIOol ooIOol = (OoIOol) ((OoIOol) this.I00iiO).I00iiO;
/* 168 */                   while (ooIOol != null) {
/* 170 */                       Object obj = ooIOol.I00iiI;
/* 172 */                       sb.append(str);
/* 175 */                       if (obj == null || !obj.getClass().isArray()) {
/* 205 */                           sb.append(obj);
                                } else {
/* 201 */                           sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                                }
/* 210 */                       ooIOol = (OoIOol) ooIOol.I00iiO;
/* 5 */                         str = ", ";
                            }
/* 214 */                   sb.append('}');
/* 217 */                   return sb.toString();
                        case 11:
/* 59 */                    StringBuilder sb2 = new StringBuilder(32);
/* 64 */                    sb2.append("PoseDetectorOptionsBase{");
/* 73 */                    l1IllOOOo1 l1illoooo1 = (l1IllOOOo1) ((l1IllOOOo1) this.I00iiI).I00iio;
/* 75 */                    while (l1illoooo1 != null) {
/* 77 */                        Object obj2 = l1illoooo1.I00iiO;
/* 79 */                        sb2.append(str);
/* 84 */                        String str2 = (String) l1illoooo1.I00iiI;
/* 86 */                        if (str2 != null) {
/* 88 */                            sb2.append(str2);
/* 93 */                            sb2.append('=');
                                }
/* 96 */                        if (obj2 == null || !obj2.getClass().isArray()) {
/* 126 */                           sb2.append(obj2);
                                } else {
/* 122 */                           sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r4.length() - 1);
                                }
/* 131 */                       l1illoooo1 = (l1IllOOOo1) l1illoooo1.I00iio;
/* 5 */                         str = ", ";
                            }
/* 135 */                   sb2.append('}');
/* 138 */                   return sb2.toString();
                        case 13:
/* 22 */                    I1OlOl11O0 i1OlOl11O0 = (I1OlOl11O0) this.I00iiO;
/* 36 */                    StringBuilder sb3 = new StringBuilder(i1OlOl11O0.toString().length() + 14);
/* 41 */                    sb3.append("propagating=[");
/* 44 */                    sb3.append(i1OlOl11O0);
/* 49 */                    sb3.append("]");
/* 52 */                    return sb3.toString();
                        default:
/* 15 */                    return super.toString();
                    }
                }

/* 10 */        public i000IO(int i) {
/* 11 */            this.I00iOIl = i;
                }
            }
