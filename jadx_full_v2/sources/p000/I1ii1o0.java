            package p000;

            import android.app.Activity;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.graphics.Rect;
            import android.media.ImageWriter;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Parcelable;
            import android.text.Layout;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.Size;
            import android.view.Surface;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.StringReader;
            import java.lang.invoke.VarHandle;
            import java.text.Bidi;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import javax.crypto.Cipher;
            import kotlin.jvm.functions.Function1;
            import org.json.JSONException;
            import org.json.JSONObject;
            
/* 684 */   public final class I1ii1o0 implements O0iI0IlO0iI, OIoiOo11o, IOiOIoiiO0i, O0ioIllo0i1, i0Ii0I1ll {
                public static int I00io1l;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
                public I1ii1o0(I1111OO10i i1111OO10i, IiIooOOOI iiIooOOOI, IliO0o11i01 iliO0o11i01, Oo0lloOiiIOI oo0lloOiiIOI, List list, boolean z) {
                    int i;
                    String str;
                    int i2;
                    List list2;
/* 3 */             I1111OO10i i1111OO10i2 = i1111OO10i;
/* 5 */             Oo0lloOiiIOI oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 9 */             this.I00iOIl = 12;
/* 14 */            this.I00iiI = i1111OO10i2;
/* 18 */            this.I00iiO = list;
/* 20 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iiI;
/* 24 */            int i3 = 0;
/* 25 */            OI0OIlOIi oI0OIlOIi = new OI0OIlOIi(i3);
/* 28 */            oI0OIlOIi.I00iiI = this;
/* 30 */            VarHandle.storeStoreFence();
/* 37 */            this.I00iio = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oI0OIlOIi);
/* 42 */            OI0OIlOIi oI0OIlOIi2 = new OI0OIlOIi(1);
/* 45 */            oI0OIlOIi2.I00iiI = this;
/* 47 */            VarHandle.storeStoreFence();
/* 54 */            this.I00ilI0I1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, oI0OIlOIi2);
/* 56 */            OIoioI0OIiI oIoioI0OIiI = oo0lloOiiIOI2.I00000oOI;
/* 58 */            I1111OO10i i1111OO10i3 = I111IiO.I00000oIO;
/* 60 */            ArrayList arrayList = i1111OO10i2.I00iio;
/* 62 */            String str2 = i1111OO10i2.I00iiI;
/* 64 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 80 */            List listI00Ol1ll1 = arrayList != null ? IOOi0Ool1i.I00Ol1ll1(arrayList, new IliIiio1(9)) : il01100l;
/* 83 */            ArrayList arrayList2 = new ArrayList();
/* 88 */            I1Il0loi i1Il0loi = new I1Il0loi();
/* 94 */            int size = listI00Ol1ll1.size();
/* 98 */            int i4 = 0;
/* 99 */            int i5 = 0;
/* 100 */           while (i4 < size) {
/* 106 */               I11110l0o i11110l0o = (I11110l0o) listI00Ol1ll1.get(i4);
/* 118 */               I11110l0o i11110l0oI00000oIO = I11110l0o.I00000oIO(i11110l0o, oIoioI0OIiI.I00000oIO((OIoioI0OIiI) i11110l0o.I00000oIO), i3, 14);
/* 122 */               Object obj = i11110l0oI00000oIO.I00000oIO;
/* 124 */               int i6 = i11110l0oI00000oIO.I0000Il00O;
/* 126 */               int i7 = i11110l0oI00000oIO.I00000oOI;
/* 128 */               while (i5 < i7 && !i1Il0loi.isEmpty()) {
/* 142 */                   I11110l0o i11110l0o2 = (I11110l0o) i1Il0loi.last();
/* 144 */                   List list3 = listI00Ol1ll1;
/* 146 */                   int i8 = i11110l0o2.I0000Il00O;
/* 148 */                   Il01100l il01100l2 = il01100l;
/* 150 */                   Object obj2 = i11110l0o2.I00000oIO;
/* 152 */                   if (i7 < i8) {
/* 159 */                       arrayList2.add(new I11110l0o(obj2, i5, i7));
/* 162 */                       i5 = i7;
/* 163 */                       listI00Ol1ll1 = list3;
/* 165 */                       il01100l = il01100l2;
                            } else {
/* 169 */                       int i9 = size;
/* 176 */                       arrayList2.add(new I11110l0o(obj2, i5, i8));
/* 179 */                       i5 = i11110l0o2.I0000Il00O;
/* 185 */                       while (!i1Il0loi.isEmpty() && i5 == ((I11110l0o) i1Il0loi.last()).I0000Il00O) {
/* 197 */                           i1Il0loi.removeLast();
                                }
/* 201 */                       listI00Ol1ll1 = list3;
/* 203 */                       il01100l = il01100l2;
/* 205 */                       size = i9;
                            }
                        }
/* 208 */               List list4 = listI00Ol1ll1;
/* 210 */               Il01100l il01100l3 = il01100l;
/* 212 */               int i10 = size;
/* 214 */               if (i5 < i7) {
/* 221 */                   arrayList2.add(new I11110l0o(oIoioI0OIiI, i5, i7));
/* 224 */                   i5 = i7;
                        }
/* 229 */               I11110l0o i11110l0o3 = (I11110l0o) i1Il0loi.I000o00OoI0I();
/* 231 */               if (i11110l0o3 != null) {
/* 233 */                   int i11 = i11110l0o3.I0000Il00O;
/* 235 */                   Object obj3 = i11110l0o3.I00000oIO;
/* 237 */                   int i12 = i11110l0o3.I00000oOI;
/* 239 */                   if (i12 == i7 && i11 == i6) {
/* 243 */                       i1Il0loi.removeLast();
/* 259 */                       i1Il0loi.addLast(new I11110l0o(((OIoioI0OIiI) obj3).I00000oIO((OIoioI0OIiI) obj), i7, i6));
                            } else if (i12 == i11) {
/* 270 */                       arrayList2.add(new I11110l0o(obj3, i12, i11));
/* 273 */                       i1Il0loi.removeLast();
/* 281 */                       i1Il0loi.addLast(new I11110l0o(obj, i7, i6));
                            } else {
/* 285 */                       if (i11 < i6) {
/* 304 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 308 */                           throw null;
                                }
/* 300 */                       i1Il0loi.addLast(new I11110l0o(((OIoioI0OIiI) obj3).I00000oIO((OIoioI0OIiI) obj), i7, i6));
                            }
                        } else {
/* 314 */                   i1Il0loi.addLast(new I11110l0o(obj, i7, i6));
                        }
/* 317 */               i4++;
/* 319 */               listI00Ol1ll1 = list4;
/* 321 */               il01100l = il01100l3;
/* 323 */               size = i10;
/* 325 */               i3 = 0;
                    }
/* 328 */           Il01100l il01100l4 = il01100l;
/* 334 */           while (i5 <= str2.length() && !i1Il0loi.isEmpty()) {
/* 346 */               I11110l0o i11110l0o4 = (I11110l0o) i1Il0loi.last();
/* 350 */               Object obj4 = i11110l0o4.I00000oIO;
/* 352 */               int i13 = i11110l0o4.I0000Il00O;
/* 357 */               arrayList2.add(new I11110l0o(obj4, i5, i13));
/* 364 */               while (!i1Il0loi.isEmpty() && i13 == ((I11110l0o) i1Il0loi.last()).I0000Il00O) {
/* 376 */                   i1Il0loi.removeLast();
                        }
/* 380 */               i5 = i13;
                    }
/* 386 */           if (i5 < str2.length()) {
/* 397 */               arrayList2.add(new I11110l0o(oIoioI0OIiI, i5, str2.length()));
                    }
/* 404 */           if (arrayList2.isEmpty()) {
/* 408 */               i = 0;
/* 412 */               arrayList2.add(new I11110l0o(oIoioI0OIiI, 0, 0));
                    } else {
/* 416 */               i = 0;
                    }
/* 423 */           ArrayList arrayList3 = new ArrayList(arrayList2.size());
/* 426 */           int size2 = arrayList2.size();
/* 430 */           int i14 = i;
/* 431 */           while (i14 < size2) {
/* 437 */               I11110l0o i11110l0o5 = (I11110l0o) arrayList2.get(i14);
/* 439 */               int i15 = i11110l0o5.I00000oOI;
/* 441 */               int i16 = i11110l0o5.I0000Il00O;
/* 452 */               String strSubstring = i15 != i16 ? str2.substring(i15, i16) : "";
/* 460 */               List listI00000oIO = I111IiO.I00000oIO(i1111OO10i2, i15, i16, new I10I0o1ii10(2));
/* 468 */               I1111OO10i i1111OO10i4 = new I1111OO10i(strSubstring, listI00000oIO == null ? il01100l4 : listI00000oIO);
/* 473 */               OIoioI0OIiI oIoioI0OIiI2 = (OIoioI0OIiI) i11110l0o5.I00000oIO;
/* 477 */               if (oIoioI0OIiI2.I00000oOI == 0) {
/* 483 */                   str = str2;
/* 485 */                   i2 = size2;
/* 521 */                   oIoioI0OIiI2 = new OIoioI0OIiI(oIoioI0OIiI2.I00000oIO, oIoioI0OIiI.I00000oOI, oIoioI0OIiI2.I0000Il00O, oIoioI0OIiI2.I0000O, oIoioI0OIiI2.I0000oI00, oIoioI0OIiI2.I0001Ioi1lo, oIoioI0OIiI2.I000II, oIoioI0OIiI2.I000O01llI0, oIoioI0OIiI2.I000OOo1O);
                        } else {
/* 527 */                   str = str2;
/* 529 */                   i2 = size2;
                        }
/* 541 */               Oo0lloOiiIOI oo0lloOiiIOI3 = new Oo0lloOiiIOI(oo0lloOiiIOI2.I00000oIO, oIoioI0OIiI.I00000oIO(oIoioI0OIiI2));
/* 544 */               ?? r5 = i1111OO10i4.I00iOIl;
/* 551 */               Il01100l il01100l5 = r5 == 0 ? il01100l4 : r5;
/* 555 */               List list5 = (List) this.I00iiO;
/* 563 */               ArrayList arrayList4 = new ArrayList(list5.size());
/* 569 */               int size3 = list5.size();
/* 573 */               int i17 = 0;
/* 574 */               while (i17 < size3) {
/* 580 */                   I11110l0o i11110l0o6 = (I11110l0o) list5.get(i17);
/* 582 */                   int i18 = i11110l0o6.I00000oOI;
/* 584 */                   OIoioI0OIiI oIoioI0OIiI3 = oIoioI0OIiI;
/* 586 */                   int i19 = i11110l0o6.I0000Il00O;
/* 592 */                   if (I111IiO.I00000oOI(i15, i16, i18, i19)) {
/* 594 */                       if (i15 > i18 || i19 > i16) {
/* 603 */                           Ioliol.I00000oIO("placeholder can not overlap with paragraph.");
                                }
/* 615 */                       list2 = list5;
/* 622 */                       arrayList4.add(new I11110l0o(i11110l0o6.I00000oIO, i18 - i15, i19 - i15));
                            } else {
/* 626 */                       list2 = list5;
                            }
/* 628 */                   i17++;
/* 632 */                   oIoioI0OIiI = oIoioI0OIiI3;
/* 634 */                   list5 = list2;
                        }
/* 651 */               I0ol0iioI i0ol0iioII00000oIO = l1o1o11OIIOo.I00000oIO(strSubstring, oo0lloOiiIOI3, il01100l5, iiIooOOOI, iliO0o11i01, arrayList4, z);
/* 655 */               OIoiOI0OI oIoiOI0OI = new OIoiOI0OI();
/* 658 */               oIoiOI0OI.I00000oIO = i0ol0iioII00000oIO;
/* 660 */               oIoiOI0OI.I00000oOI = i15;
/* 662 */               oIoiOI0OI.I0000Il00O = i16;
/* 664 */               VarHandle.storeStoreFence();
/* 667 */               arrayList3.add(oIoiOI0OI);
/* 670 */               i14++;
/* 672 */               i1111OO10i2 = i1111OO10i;
/* 674 */               oo0lloOiiIOI2 = oo0lloOiiIOI;
/* 676 */               str2 = str;
/* 678 */               size2 = i2;
                    }
/* 683 */           this.I00ilO0 = arrayList3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static I1ii1o0 I001l0I00(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
/* 10 */            I1ii1o0 i1ii1o0 = new I1ii1o0(17, 0 == true ? 1 : 0);
/* 15 */            ArrayDeque arrayDeque = new ArrayDeque();
/* 18 */            i1ii1o0.I00ilI0I1 = arrayDeque;
/* 20 */            i1ii1o0.I00iiI = sharedPreferences;
/* 22 */            i1ii1o0.I00iiO = "topic_operation_queue";
/* 24 */            i1ii1o0.I00iio = ",";
/* 26 */            i1ii1o0.I00ilO0 = scheduledThreadPoolExecutor;
/* 28 */            VarHandle.storeStoreFence();
                    synchronized (arrayDeque) {
                        try {
/* 32 */                    arrayDeque.clear();
/* 37 */                    String string = sharedPreferences.getString("topic_operation_queue", "");
/* 45 */                    if (!TextUtils.isEmpty(string) && string.contains(",")) {
/* 55 */                        String[] strArrSplit = string.split(",", -1);
/* 60 */                        if (strArrSplit.length == 0) {
/* 66 */                            Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                                }
/* 73 */                        for (String str : strArrSplit) {
/* 81 */                            if (!TextUtils.isEmpty(str)) {
/* 87 */                                ((ArrayDeque) i1ii1o0.I00ilI0I1).add(str);
                                    }
                                }
/* 94 */                        return i1ii1o0;
                            }
/* 96 */                    return i1ii1o0;
                        } finally {
                        }
                    }
                }

                public static I1ii1o0 I00II0Ol1O0l(JSONObject jSONObject) throws JSONException {
/* 3 */             lII1IoI.I0000Il00O("json object cannot be null", jSONObject);
/* 12 */            if (!jSONObject.has("discoveryDoc")) {
/* 60 */                lII1IoI.I00000oIO("missing authorizationEndpoint", jSONObject.has("authorizationEndpoint"));
/* 71 */                lII1IoI.I00000oIO("missing tokenEndpoint", jSONObject.has("tokenEndpoint"));
/* 96 */                return new I1ii1o0(l0IlIoi1oIoO.I0000oI00(jSONObject, "authorizationEndpoint"), l0IlIoi1oIoO.I0000oI00(jSONObject, "tokenEndpoint"), l0IlIoi1oIoO.I0001Ioi1lo(jSONObject, "registrationEndpoint"), l0IlIoi1oIoO.I0001Ioi1lo(jSONObject, "endSessionEndpoint"));
                    }
                    try {
/* 25 */                return new I1ii1o0(new I1iiO10I0i0O(jSONObject.optJSONObject("discoveryDoc")));
                    } catch (I1iiIIoo e) {
/* 51 */                throw new JSONException("Missing required field in discovery doc: " + e.I00iOIl);
                    }
                }

                @Override
                public Object I00000oIO(Class cls) {
/* 13 */            if (!((Set) this.I00iiI).contains(OOiilOlOOI.I00000oIO(cls))) {
/* 44 */                OIiilo1Ool0o.I0010I0i(cls, "Attempting to request an undeclared dependency ", ".");
/* 47 */                return null;
                    }
/* 19 */            Object objI00000oIO = ((IOiOIoiiO0i) this.I00ilO0).I00000oIO(cls);
/* 29 */            if (!cls.equals(OOiiOioO0.class)) {
/* 31 */                return objI00000oIO;
                    }
/* 36 */            return new Oi101ll1i0O();
                }

                @Override
                public boolean I00000oOI() {
                    return ((OooioIIoi0O) this.I00ilO0) != null;
                }

                @Override
                public Object I0000Il00O() {
/* 5 */             Context contextI00000oOI = ((i0O00lI) this.I00iiI).I00000oOI();
/* 13 */            Object objI0000Il00O = ((i0IOo0i0) this.I00iiO).I0000Il00O();
/* 21 */            Object objI0000Il00O2 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 29 */            Object objI0000Il00O3 = ((i0IOo0i0) this.I00ilI0I1).I0000Il00O();
/* 49 */            i0OI0oooo i0oi0oooo = (i0OI0oooo) ((i0IOo0i0) this.I00ilO0).I0000Il00O();
/* 54 */            i0IiOoOl i0iioool = new i0IiOoOl("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService", 0);
/* 64 */            i0iioool.I000O01llI0 = new OlOilIlol1("AssetPackExtractionService");
/* 66 */            i0iioool.I000OOo1O = contextI00000oOI;
/* 68 */            i0iioool.I000OiO = (i0Il00O1) objI0000Il00O;
/* 70 */            i0iioool.I000iOII = (i0OOOllloIII) objI0000Il00O2;
/* 72 */            i0iioool.I000l1 = (i0O0i11IO0l0) objI0000Il00O3;
/* 74 */            i0iioool.I000lI = i0oi0oooo;
/* 76 */            VarHandle.storeStoreFence();
/* 110 */           return i0iioool;
                }

                @Override
                public boolean I0000O() {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00ilO0;
/* 5 */             int size = arrayList.size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 25 */                if (((OIoiOI0OI) arrayList.get(i)).I00000oIO.I0000O()) {
/* 27 */                    return true;
                        }
                    }
/* 9 */             return false;
                }

                @Override
                public Set I0000oI00(OOiilOlOOI oOiilOlOOI) {
/* 9 */             if (((Set) this.I00iio).contains(oOiilOlOOI)) {
/* 15 */                return ((IOiOIoiiO0i) this.I00ilO0).I0000oI00(oOiilOlOOI);
                    }
/* 24 */            OIiilo1Ool0o.I0010I0i(oOiilOlOOI, "Attempting to request an undeclared dependency Set<", ">.");
/* 27 */            return null;
                }

                @Override
                public OOiO0Il I0001Ioi1lo(Class cls) {
/* 5 */             return I000OiO(OOiilOlOOI.I00000oIO(cls));
                }

                @Override
                public float I000II() {
/* 11 */            return ((Number) ((O0ioIllo0i1) this.I00iio).getValue()).floatValue();
                }

                @Override
                public OOiO0Il I000O01llI0(OOiilOlOOI oOiilOlOOI) {
/* 9 */             if (((Set) this.I00ilI0I1).contains(oOiilOlOOI)) {
/* 15 */                return ((IOiOIoiiO0i) this.I00ilO0).I000O01llI0(oOiilOlOOI);
                    }
/* 24 */            OIiilo1Ool0o.I0010I0i(oOiilOlOOI, "Attempting to request an undeclared dependency Provider<Set<", ">>.");
/* 27 */            return null;
                }

                @Override
                public void I000OOo1O() {
/* 5 */             ((IOiOol0) this.I00iiO).I000OOo1O();
/* 10 */            IOiOol0 iOiOol0 = (IOiOol0) this.I00iio;
/* 35 */            ((HashMap) iOiOol0.I00iiI).put((OI1Iio0ii1) this.I00ilI0I1, new I11IOOl1IolO((I111oOiIiO0) IOOi0Ool1i.I00OilO00Il((ArrayList) this.I00ilO0)));
                }

                @Override
                public OOiO0Il I000OiO(OOiilOlOOI oOiilOlOOI) {
/* 9 */             if (((Set) this.I00iiO).contains(oOiilOlOOI)) {
/* 15 */                return ((IOiOIoiiO0i) this.I00ilO0).I000OiO(oOiilOlOOI);
                    }
/* 24 */            OIiilo1Ool0o.I0010I0i(oOiilOlOOI, "Attempting to request an undeclared dependency Provider<", ">.");
/* 27 */            return null;
                }

                @Override
                public Object I000iOII(OOiilOlOOI oOiilOlOOI) {
/* 9 */             if (((Set) this.I00iiI).contains(oOiilOlOOI)) {
/* 15 */                return ((IOiOIoiiO0i) this.I00ilO0).I000iOII(oOiilOlOOI);
                    }
/* 24 */            OIiilo1Ool0o.I0010I0i(oOiilOlOOI, "Attempting to request an undeclared dependency ", ".");
/* 27 */            return null;
                }

                @Override
                public float I000l1() {
/* 11 */            return ((Number) ((O0ioIllo0i1) this.I00ilI0I1).getValue()).floatValue();
                }

                @Override
                public void I000lI(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 5 */             ((IOiOol0) this.I00iiI).I000lI(oI1Iio0ii1, obj);
                }

                public void I000o00OoI0I(IIIiOOOloI iIIiOOOloI, Class cls) {
/* 10 */            ((ArrayList) this.I00iiO).add(new OIoi0IIoi(iIIiOOOloI, cls));
                }

                public void I000oI1ioi(IlIIoIo ilIIoIo, Class cls) {
/* 10 */            ((ArrayList) this.I00ilI0I1).add(new OIoi0IIoi(ilIIoIo, cls));
                }

                public IIoi0i I00100l0(I1lil0ol i1lil0ol, IllOOo00lI illOOo00lI) {
                    int i;
                    int i2;
                    int i3;
/* 3 */             OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 7 */             oOo0ll111.I00iOIl = -1;
                    synchronized (this.I00iiI) {
/* 14 */                Throwable th = (Throwable) this.I00iiO;
/* 16 */                if (th != null) {
/* 18 */                    i1lil0ol.I00000oOI(th);
/* 21 */                    return loIOiIO1O1.I00iiO;
                        }
/* 30 */                I1Ooo1ii0l i1Ooo1ii0l = (I1Ooo1ii0l) this.I00iio;
/* 42 */                do {
/* 32 */                    i = i1Ooo1ii0l.get();
/* 36 */                    i2 = i + 1;
/* 42 */                } while (!i1Ooo1ii0l.compareAndSet(i, i2));
/* 54 */                boolean z = (134217727 & i2) == 1;
/* 59 */                oOo0ll111.I00iOIl = (i2 >>> 27) & 15;
/* 65 */                ((OI0oiiIO0) this.I00ilI0I1).I00000oOI(i1lil0ol);
/* 69 */                if (z && illOOo00lI != null) {
                            try {
/* 73 */                        illOOo00lI.invoke();
                            } catch (Throwable th2) {
                                synchronized (this.I00iiI) {
                                    try {
/* 85 */                                if (((Throwable) this.I00iiO) == null) {
/* 89 */                                    this.I00iiO = th2;
/* 93 */                                    OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00ilI0I1;
/* 95 */                                    Object[] objArr = oI0oiiIO0.I00000oIO;
/* 97 */                                    int i4 = oI0oiiIO0.I00000oOI;
/* 100 */                                   for (int i5 = 0; i5 < i4; i5++) {
/* 106 */                                       ((I1lil0ol) objArr[i5]).I00000oOI(th2);
                                            }
/* 118 */                                   ((OI0oiiIO0) this.I00ilI0I1).I0000oI00();
/* 123 */                                   I1Ooo1ii0l i1Ooo1ii0l2 = (I1Ooo1ii0l) this.I00iio;
/* 142 */                                   do {
/* 125 */                                       i3 = i1Ooo1ii0l2.get();
/* 142 */                                   } while (!i1Ooo1ii0l2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                        }
                                    } catch (Throwable th3) {
/* 146 */                               throw th3;
                                    }
                                }
                            }
                        }
/* 152 */               I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(3);
/* 155 */               i0iI0O1IoIoI.I00iiI = i1lil0ol;
/* 157 */               i0iI0O1IoIoI.I00iiO = this;
/* 159 */               i0iI0O1IoIoI.I00iio = oOo0ll111;
/* 161 */               VarHandle.storeStoreFence();
/* 166 */               OlOO1i11110 olOO1i11110 = new OlOO1i11110(21);
/* 169 */               olOO1i11110.I00iiI = i0iI0O1IoIoI;
/* 176 */               olOO1i11110.I00iiO = new I1Ooo1ii0l(0);
/* 178 */               VarHandle.storeStoreFence();
/* 181 */               return olOO1i11110;
                    }
                }

                public I0Oi111ii I00100o1O0lo() {
/* 3 */             IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) this.I00iiI;
/* 5 */             if (ioOi01OlIl1o == null) {
/* 70 */                I000II.I001IO000("url == null");
/* 73 */                return null;
                    }
/* 9 */             String str = (String) this.I00iiO;
/* 15 */            Io1Io0OOi011 io1Io0OOi011I0000Il00O = ((Io1IlO1I1i) this.I00iio).I0000Il00O();
/* 21 */            I00Ol00 i00Ol00 = (I00Ol00) this.I00ilI0I1;
/* 25 */            LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00ilO0;
/* 27 */            byte[] bArr = OollIoI001lo.I00000oIO;
/* 43 */            Object objUnmodifiableMap = linkedHashMap.isEmpty() ? Il011I1OiO0I.I00iOIl : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
/* 51 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(10);
/* 54 */            i0Oi111ii.I00iiI = ioOi01OlIl1o;
/* 56 */            i0Oi111ii.I00iiO = str;
/* 58 */            i0Oi111ii.I00iio = io1Io0OOi011I0000Il00O;
/* 60 */            i0Oi111ii.I00ilI0I1 = i00Ol00;
/* 62 */            i0Oi111ii.I00ilO0 = objUnmodifiableMap;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            return i0Oi111ii;
                }

                public I1lIlOi1OI0 I0010I0i() {
/* 10 */            String strConcat = ((IiIO1ol1i1o0) this.I00iiI) == null ? " surface" : "";
/* 16 */            if (((List) this.I00iiO) == null) {
/* 20 */                strConcat = strConcat.concat(" sharedSurfaces");
                    }
/* 28 */            if (((Integer) this.I00iio) == null) {
/* 32 */                strConcat = strConcat.concat(" mirrorMode");
                    }
/* 40 */            if (((Integer) this.I00ilI0I1) == null) {
/* 44 */                strConcat = strConcat.concat(" surfaceGroupId");
                    }
/* 52 */            if (((Iio1oiI) this.I00ilO0) == null) {
/* 56 */                strConcat = strConcat.concat(" dynamicRange");
                    }
/* 64 */            if (!strConcat.isEmpty()) {
/* 119 */               I000II.I001IO000("Missing required properties:".concat(strConcat));
/* 122 */               return null;
                    }
/* 70 */            IiIO1ol1i1o0 iiIO1ol1i1o0 = (IiIO1ol1i1o0) this.I00iiI;
/* 74 */            List list = (List) this.I00iiO;
/* 80 */            int iIntValue = ((Integer) this.I00iio).intValue();
/* 88 */            int iIntValue2 = ((Integer) this.I00ilI0I1).intValue();
/* 94 */            Iio1oiI iio1oiI = (Iio1oiI) this.I00ilO0;
/* 96 */            I1lIlOi1OI0 i1lIlOi1OI0 = new I1lIlOi1OI0();
/* 99 */            i1lIlOi1OI0.I00000oIO = iiIO1ol1i1o0;
/* 101 */           i1lIlOi1OI0.I00000oOI = list;
/* 103 */           i1lIlOi1OI0.I0000Il00O = iIntValue;
/* 105 */           i1lIlOi1OI0.I0000O = iIntValue2;
/* 107 */           i1lIlOi1OI0.I0000oI00 = iio1oiI;
/* 109 */           VarHandle.storeStoreFence();
/* 112 */           return i1lIlOi1OI0;
                }

                public void I0010o(IIi100 iIi100) {
/* 1 */             String string = iIi100.toString();
/* 5 */             int length = string.length();
/* 11 */            Io1IlO1I1i io1IlO1I1i = (Io1IlO1I1i) this.I00iio;
/* 15 */            if (length == 0) {
/* 17 */                io1IlO1I1i.I0000O("Cache-Control");
                    } else {
/* 21 */                io1IlO1I1i.I0000oI00("Cache-Control", string);
                    }
                }

                public void I00111O() {
                    IoilI00 ioilI00;
/* 1 */             lOllIO.I00000oIO();
/* 6 */             I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iio;
/* 8 */             i0Oi111ii.getClass();
/* 11 */            lOllIO.I00000oIO();
/* 16 */            I1ioOiOI i1ioOiOI = (I1ioOiOI) i0Oi111ii.I00ilO0;
/* 18 */            Objects.requireNonNull(i1ioOiOI);
/* 23 */            OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) i0Oi111ii.I00iiO;
/* 25 */            Objects.requireNonNull(oOlli1l1lOlI);
/* 30 */            OOlli1l1lOlI oOlli1l1lOlI2 = (OOlli1l1lOlI) i0Oi111ii.I00iio;
/* 32 */            IoilI00 ioilI002 = i1ioOiOI.I0000Il00O;
/* 34 */            Objects.requireNonNull(ioilI002);
/* 37 */            ioilI002.I00000oIO();
/* 40 */            IoilI00 ioilI003 = i1ioOiOI.I0000Il00O;
/* 42 */            Objects.requireNonNull(ioilI003);
/* 47 */            ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(ioilI003.I0000oI00);
/* 54 */            IIoo0O0l11 iIoo0O0l11 = new IIoo0O0l11(0);
/* 57 */            iIoo0O0l11.I00iiI = oOlli1l1lOlI;
/* 59 */            VarHandle.storeStoreFence();
/* 66 */            listenableFutureI0000oI00.addListener(iIoo0O0l11, O1OIIoio0i1.I0000O());
/* 69 */            IoilI00 ioilI004 = i1ioOiOI.I0000oI00;
/* 71 */            int i = 1;
/* 72 */            if (ioilI004 != null) {
/* 74 */                ioilI004.I00000oIO();
/* 81 */                ListenableFuture listenableFutureI0000oI002 = iIllIoiiIO.I0000oI00(i1ioOiOI.I0000oI00.I0000oI00);
/* 87 */                IIoo0O0l11 iIoo0O0l112 = new IIoo0O0l11(i);
/* 91 */                iIoo0O0l112.I00iiI = null;
/* 93 */                VarHandle.storeStoreFence();
/* 100 */               listenableFutureI0000oI002.addListener(iIoo0O0l112, O1OIIoio0i1.I0000O());
                    }
/* 109 */           if (i1ioOiOI.I000O01llI0.size() > 1 && (ioilI00 = i1ioOiOI.I0000O) != null) {
/* 115 */               ioilI00.I00000oIO();
/* 122 */               ListenableFuture listenableFutureI0000oI003 = iIllIoiiIO.I0000oI00(i1ioOiOI.I0000O.I0000oI00);
/* 129 */               IIoo0O0l11 iIoo0O0l113 = new IIoo0O0l11(2);
/* 132 */               iIoo0O0l113.I00iiI = oOlli1l1lOlI2;
/* 134 */               VarHandle.storeStoreFence();
/* 141 */               listenableFutureI0000oI003.addListener(iIoo0O0l113, O1OIIoio0i1.I0000O());
                    }
/* 148 */           ((OoIlIoo1oiOo) this.I00ilI0I1).getClass();
                }

                public IIl00O I001IIilI0O(IIlIIOi iIlIIOi, Map map, Map map2) {
/* 5 */             Oo10IliO00O oo10IliO00O = (Oo10IliO00O) this.I00iiI;
/* 9 */             IIliIi1O0OiO iIliIi1O0OiO = (IIliIi1O0OiO) this.I00iiO;
/* 11 */            iIliIi1O0OiO.getClass();
/* 16 */            OlOO00iI0lI olOO00iI0lI = (OlOO00iI0lI) this.I00iio;
/* 20 */            OlOl1I olOl1I = (OlOl1I) this.I00ilO0;
/* 24 */            IIl10I1 iIl10I1 = (IIl10I1) this.I00ilI0I1;
/* 26 */            IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 32 */            IIlo0i0ll iIlo0i0llI00000oIO = iIl10I1.I00000oIO.I00000oIO(iIliIi1O0OiO.I00000oIO);
/* 36 */            iIlo0OOlI.getClass();
/* 39 */            boolean zI00000oOI = IIlo0OOlI.I00000oOI(iIlo0i0llI00000oIO);
/* 43 */            IIl00O iIl00O = new IIl00O();
/* 46 */            iIl00O.I00000oIO = iIlIIOi;
/* 48 */            iIl00O.I00000oOI = oo10IliO00O;
/* 51 */            iIl00O.I0000Il00O = 1;
/* 53 */            iIl00O.I0000O = map;
/* 55 */            iIl00O.I0000oI00 = map2;
/* 57 */            iIl00O.I0001Ioi1lo = olOO00iI0lI;
/* 59 */            iIl00O.I000II = olOl1I;
/* 61 */            iIl00O.I000O01llI0 = zI00000oOI;
/* 63 */            I1OollilIo i1OollilIo = IIl00Ooo.I00000oIO;
/* 65 */            i1OollilIo.getClass();
/* 74 */            iIl00O.I000OOo1O = I1OollilIo.I00000oOI.incrementAndGet(i1OollilIo);
/* 81 */            iIl00O.I000OiO = new Object();
/* 83 */            List list = olOO00iI0lI.I00ilO0;
/* 92 */            I0oO11I i0oO11I = null;
/* 93 */            if (!list.isEmpty()) {
/* 99 */                OlOIloo1i olOIloo1i = (OlOIloo1i) IOOi0Ool1i.I001lllioOl(list);
/* 101 */               Surface inputSurface = iIlIIOi.getInputSurface();
/* 105 */               if (inputSurface == null) {
/* 190 */                   I000II.I001IO000("inputSurface is required to create instance of imageWriter.");
/* 92 */                    return null;
                        }
                        try {
/* 107 */                   int i = olOIloo1i.I00000oIO;
/* 111 */                   OlOIOoII1i olOIOoII1iI00000oIO = OlOIOoII1i.I00000oIO(olOIloo1i.I00000oOI);
/* 115 */                   Handler handlerI00000oIO = oo10IliO00O.I00000oIO();
/* 121 */                   ImageWriter imageWriterNewInstance = ImageWriter.newInstance(inputSurface, 1, olOIOoII1iI00000oIO.I00000oIO);
/* 127 */                   I0oO11I i0oO11I2 = new I0oO11I();
/* 130 */                   i0oO11I2.I00iOIl = imageWriterNewInstance;
/* 132 */                   i0oO11I2.I00iiI = i;
/* 138 */                   i0oO11I2.I00iiO = iOOOIOoiIlII.I0000O(null);
/* 140 */                   imageWriterNewInstance.getMaxImages();
/* 143 */                   imageWriterNewInstance.getFormat();
/* 146 */                   VarHandle.storeStoreFence();
/* 149 */                   imageWriterNewInstance.setOnImageReleasedListener(i0oO11I2, handlerI00000oIO);
/* 152 */                   i0oO11I = i0oO11I2;
                        } catch (RuntimeException e) {
/* 176 */                   Log.e("CXCP", "Failed to create ImageWriter for session " + iIlIIOi + "! Reprocessing will not be supported!", e);
                        }
/* 179 */               if (i0oO11I != null) {
/* 181 */                   i0oO11I.toString();
/* 184 */                   Objects.toString(iIlIIOi);
                        }
                    }
/* 194 */           iIl00O.I000lI = i0oO11I;
/* 196 */           VarHandle.storeStoreFence();
/* 408 */           return iIl00O;
                }

                @Override
                public void I001IO000(OI1Iio0ii1 oI1Iio0ii1, IOIOo1o iOIOo1o) {
/* 5 */             ((IOiOol0) this.I00iiI).I001IO000(oI1Iio0ii1, iOIOo1o);
                }

                public void I001i1O0Ol(IIllOo0 iIllOo0, IIllOo0 iIllOo02, OlioOil olioOil, OlioOil olioOil2, Map.Entry entry) {
/* 5 */             OlioOil olioOil3 = (OlioOil) entry.getValue();
/* 7 */             Objects.toString(olioOil3);
/* 13 */            l11I11lO.I0000O(3, "DualSurfaceProcessorNode");
/* 18 */            Size size = olioOil.I000II.I00000oIO;
/* 28 */            Rect rect = ((I1l011l) entry.getKey()).I00000oIO.I0000O;
/* 33 */            if (!olioOil.I0000Il00O) {
/* 36 */                iIllOo0 = null;
                    }
/* 57 */            I1lIol0O i1lIol0OI00000oIO = I1lIol0O.I00000oIO(size, rect, iIllOo0, ((I1l011l) entry.getKey()).I00000oIO.I0001Ioi1lo, ((I1l011l) entry.getKey()).I00000oIO.I000II);
/* 63 */            Size size2 = olioOil2.I000II.I00000oIO;
/* 73 */            Rect rect2 = ((I1l011l) entry.getKey()).I00000oOI.I0000O;
/* 77 */            if (!olioOil2.I0000Il00O) {
/* 80 */                iIllOo02 = null;
                    }
/* 115 */           IO0oo1I0oIO iO0oo1I0oIOI0000Il00O = olioOil3.I0000Il00O(((I1l011l) entry.getKey()).I00000oIO.I0000Il00O, i1lIol0OI00000oIO, I1lIol0O.I00000oIO(size2, rect2, iIllOo02, ((I1l011l) entry.getKey()).I00000oOI.I0001Ioi1lo, ((I1l011l) entry.getKey()).I00000oOI.I000II));
/* 123 */           OlOO1i11110 olOO1i11110 = new OlOO1i11110(11);
/* 126 */           olOO1i11110.I00iiO = this;
/* 128 */           olOO1i11110.I00iiI = olioOil3;
/* 130 */           VarHandle.storeStoreFence();
/* 137 */           iIllIoiiIO.I00000oIO(iO0oo1I0oIOI0000Il00O, olOO1i11110, O1OIIoio0i1.I0000O());
                }

                @Override
                public O0iI1ol I001i1lo1io(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return ((IOiOol0) this.I00iiI).I001i1lo1io(oI1Iio0ii1);
                }

                @Override
                public void I001iOo1i0O(OI1Iio0ii1 oI1Iio0ii1, IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii12) {
/* 5 */             ((IOiOol0) this.I00iiI).I001iOo1i0O(oI1Iio0ii1, iOIOill, oI1Iio0ii12);
                }

                public OlIOI10i1 I001lIiIIo1O() {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00ilO0;
/* 7 */             Intent intent = (Intent) this.I00iio;
/* 11 */            OI1lo1liOO oI1lo1liOO = (OI1lo1liOO) this.I00ilI0I1;
/* 18 */            if (arrayList.isEmpty()) {
/* 182 */               I000II.I001IO000("You must call setDestination() or addDestination() before constructing the deep link");
/* 17 */                return null;
                    }
/* 22 */            ArrayList arrayList2 = new ArrayList();
/* 27 */            ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
/* 30 */            Iterator it = arrayList.iterator();
/* 34 */            OI1ilOI1ioo0 oI1ilOI1ioo0 = null;
                    while (true) {
/* 39 */                int i = 0;
/* 40 */                if (!it.hasNext()) {
/* 106 */                   intent.putExtra("android-support-nav:controller:deepLinkIds", IOOi0Ool1i.I00iIO(arrayList2));
/* 111 */                   intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
/* 118 */                   OlIOI10i1 olIOI10i1I0000O = OlIOI10i1.I0000O((Context) this.I00iiI);
/* 124 */                   ArrayList arrayList4 = (ArrayList) olIOI10i1I0000O.I00iiI;
/* 128 */                   Intent intent2 = new Intent(intent);
/* 131 */                   ComponentName component = intent2.getComponent();
/* 135 */                   if (component == null) {
/* 145 */                       component = intent2.resolveActivity(((Context) olIOI10i1I0000O.I00iiO).getPackageManager());
                            }
/* 149 */                   if (component != null) {
/* 151 */                       olIOI10i1I0000O.I00000oOI(component);
                            }
/* 154 */                   arrayList4.add(intent2);
/* 157 */                   int size = arrayList4.size();
/* 161 */                   while (i < size) {
/* 167 */                       Intent intent3 = (Intent) arrayList4.get(i);
/* 169 */                       if (intent3 != null) {
/* 173 */                           intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                                }
/* 176 */                       i++;
                            }
/* 179 */                   return olIOI10i1I0000O;
                        }
/* 46 */                OI1iiioIOi1 oI1iiioIOi1 = (OI1iiioIOi1) it.next();
/* 48 */                int i2 = oI1iiioIOi1.I00000oIO;
/* 50 */                Bundle bundle = oI1iiioIOi1.I00000oOI;
/* 52 */                OI1ilOI1ioo0 oI1ilOI1ioo0I001lllioOl = I001lllioOl(i2);
/* 56 */                if (oI1ilOI1ioo0I001lllioOl == null) {
/* 82 */                    int i3 = OI1ilOI1ioo0.I00ilI0I1;
/* 96 */                    OoOil11Ol1o.I0010o("Navigation destination ", l1iO11O10.I00000oIO((I1O0ol) this.I00iiO, i2), " cannot be found in the navigation graph ", oI1lo1liOO);
/* 17 */                    return null;
                        }
/* 58 */                int[] iArrI0000O = oI1ilOI1ioo0I001lllioOl.I0000O(oI1ilOI1ioo0);
/* 62 */                int length = iArrI0000O.length;
/* 63 */                while (i < length) {
/* 71 */                    arrayList2.add(Integer.valueOf(iArrI0000O[i]));
/* 74 */                    arrayList3.add(bundle);
/* 77 */                    i++;
                        }
/* 80 */                oI1ilOI1ioo0 = oI1ilOI1ioo0I001lllioOl;
                    }
                }

                public OI1ilOI1ioo0 I001lllioOl(int i) {
/* 3 */             I1Il0loi i1Il0loi = new I1Il0loi();
/* 10 */            i1Il0loi.addLast((OI1lo1liOO) this.I00ilI0I1);
/* 17 */            while (!i1Il0loi.isEmpty()) {
/* 23 */                OI1ilOI1ioo0 oI1ilOI1ioo0 = (OI1ilOI1ioo0) i1Il0loi.removeFirst();
/* 29 */                if (oI1ilOI1ioo0.I00iiI.I00000oOI == i) {
/* 31 */                    return oI1ilOI1ioo0;
                        }
/* 34 */                if (oI1ilOI1ioo0 instanceof OI1lo1liOO) {
/* 38 */                    Iterator it = ((OI1lo1liOO) oI1ilOI1ioo0).iterator();
                            while (true) {
/* 43 */                        OI1o11OI oI1o11OI = (OI1o11OI) it;
/* 49 */                        if (oI1o11OI.hasNext()) {
/* 57 */                            i1Il0loi.addLast((OI1ilOI1ioo0) oI1o11OI.next());
                                }
                            }
                        }
                    }
/* 61 */            return null;
                }

                public void I001lloI(Function1 function1) {
                    int i;
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) this.I00ilI0I1;
/* 12 */                    this.I00ilI0I1 = (OI0oiiIO0) this.I00ilO0;
/* 14 */                    this.I00ilO0 = oI0oiiIO0;
/* 18 */                    I1Ooo1ii0l i1Ooo1ii0l = (I1Ooo1ii0l) this.I00iio;
/* 38 */                    do {
/* 20 */                        i = i1Ooo1ii0l.get();
/* 38 */                    } while (!i1Ooo1ii0l.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
/* 40 */                    int i2 = oI0oiiIO0.I00000oOI;
/* 43 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 49 */                        function1.invoke(oI0oiiIO0.I000II(i3));
                            }
/* 57 */                    oI0oiiIO0.I0000oI00();
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public float I00II0oii1o(int i, boolean z) {
/* 3 */             Layout layout = (Layout) this.I00iiI;
/* 9 */             int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
/* 13 */            if (i > lineEnd) {
/* 15 */                i = lineEnd;
                    }
                    return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
                }

                @Override
                public O0iI0IlO0iI I00IO1(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             return ((IOiOol0) this.I00iiI).I00IO1(iOIOill, oI1Iio0ii1);
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public float I00IO1oi11O(int i, boolean z, boolean z2) {
                    int i2;
                    int i3;
                    boolean z3;
                    int i4;
                    Bidi bidi;
                    Bidi bidi2;
                    boolean z4;
/* 9 */             ArrayList arrayList = (ArrayList) this.I00iiO;
/* 13 */            Layout layout = (Layout) this.I00iiI;
/* 15 */            if (!z2) {
/* 17 */                return I00II0oii1o(i, z);
                    }
/* 22 */            int iI00000oIO = l0o0I0iIlo.I00000oIO(layout, i, z2);
/* 26 */            int lineStart = layout.getLineStart(iI00000oIO);
/* 30 */            int lineEnd = layout.getLineEnd(iI00000oIO);
/* 34 */            if (i != lineStart && i != lineEnd) {
/* 38 */                return I00II0oii1o(i, z);
                    }
/* 43 */            if (i == 0 || i == layout.getText().length()) {
/* 621 */               return I00II0oii1o(i, z);
                    }
/* 61 */            int iI00000oOI = IOOi1I.I00000oOI(arrayList, Integer.valueOf(i));
/* 71 */            int i5 = iI00000oOI < 0 ? -(iI00000oOI + 1) : iI00000oOI + 1;
/* 72 */            if (z2 && i5 > 0) {
                        int i6 = i5 - 1;
/* 88 */                if (i == ((Number) arrayList.get(i6)).intValue()) {
/* 90 */                    i5 = i6;
                        }
                    }
/* 120 */           boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i5 == 0 ? 0 : ((Number) arrayList.get(i5 + (-1))).intValue())) == -1;
/* 121 */           int iI00IlilI0i0i = I00IlilI0i0i(lineEnd, lineStart);
/* 137 */           int iIntValue = i5 == 0 ? 0 : ((Number) arrayList.get(i5 - 1)).intValue();
/* 141 */           int i7 = lineStart - iIntValue;
/* 143 */           int i8 = iI00IlilI0i0i - iIntValue;
/* 147 */           ArrayList arrayList2 = (ArrayList) this.I00iio;
/* 151 */           boolean[] zArr = (boolean[]) this.I00ilI0I1;
/* 157 */           if (zArr[i5]) {
/* 163 */               bidi2 = (Bidi) arrayList2.get(i5);
/* 165 */               i3 = iI00000oIO;
/* 167 */               i2 = iI00IlilI0i0i;
/* 169 */               i4 = -1;
                    } else {
/* 184 */               int iIntValue2 = i5 == 0 ? 0 : ((Number) arrayList.get(i5 - 1)).intValue();
/* 194 */               int iIntValue3 = ((Number) arrayList.get(i5)).intValue();
/* 198 */               int i9 = iIntValue3 - iIntValue2;
/* 204 */               char[] cArr = (char[]) this.I00ilO0;
/* 206 */               i2 = iI00IlilI0i0i;
/* 208 */               if (cArr == null || cArr.length < i9) {
/* 213 */                   cArr = new char[i9];
                        }
/* 219 */               i3 = iI00000oIO;
/* 222 */               TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr, 0);
/* 229 */               if (Bidi.requiresBidi(cArr, 0, i9)) {
/* 255 */                   i4 = -1;
/* 275 */                   Bidi bidi3 = new Bidi(cArr, 0, null, 0, i9, layout.getParagraphDirection(layout.getLineForOffset(i5 == 0 ? 0 : ((Number) arrayList.get(i5 + (-1))).intValue())) == -1 ? 1 : 0);
/* 282 */                   z3 = true;
/* 283 */                   if (bidi3.getRunCount() != 1) {
/* 288 */                       bidi = bidi3;
                            }
/* 294 */                   arrayList2.set(i5, bidi);
/* 297 */                   zArr[i5] = z3;
/* 299 */                   if (bidi != null) {
/* 303 */                       char[] cArr2 = (char[]) this.I00ilO0;
/* 310 */                       cArr = cArr == cArr2 ? null : cArr2;
                            }
/* 311 */                   this.I00ilO0 = cArr;
/* 313 */                   bidi2 = bidi;
                        } else {
/* 291 */                   z3 = true;
/* 292 */                   i4 = -1;
                        }
/* 285 */               bidi = null;
/* 294 */               arrayList2.set(i5, bidi);
/* 297 */               zArr[i5] = z3;
/* 299 */               if (bidi != null) {
                        }
/* 311 */               this.I00ilO0 = cArr;
/* 313 */               bidi2 = bidi;
                    }
/* 316 */           Bidi bidiCreateLineBidi = bidi2 != null ? bidi2.createLineBidi(i7, i8) : null;
/* 322 */           if (bidiCreateLineBidi == null) {
/* 581 */               z4 = true;
                    } else {
/* 329 */               if (bidiCreateLineBidi.getRunCount() != 1) {
/* 338 */                   int runCount = bidiCreateLineBidi.getRunCount();
/* 342 */                   O0iOioIo0l[] o0iOioIo0lArr = new O0iOioIo0l[runCount];
/* 345 */                   for (int i10 = 0; i10 < runCount; i10++) {
/* 353 */                       int runStart = bidiCreateLineBidi.getRunStart(i10) + lineStart;
/* 358 */                       int runLimit = bidiCreateLineBidi.getRunLimit(i10) + lineStart;
/* 370 */                       boolean z6 = bidiCreateLineBidi.getRunLevel(i10) % 2 == 1;
/* 371 */                       O0iOioIo0l o0iOioIo0l = new O0iOioIo0l();
/* 374 */                       o0iOioIo0l.I00000oIO = runStart;
/* 376 */                       o0iOioIo0l.I00000oOI = runLimit;
/* 378 */                       o0iOioIo0l.I0000Il00O = z6;
/* 380 */                       VarHandle.storeStoreFence();
/* 383 */                       o0iOioIo0lArr[i10] = o0iOioIo0l;
                            }
/* 388 */                   int runCount2 = bidiCreateLineBidi.getRunCount();
/* 392 */                   byte[] bArr = new byte[runCount2];
/* 395 */                   for (int i11 = 0; i11 < runCount2; i11++) {
/* 402 */                       bArr[i11] = (byte) bidiCreateLineBidi.getRunLevel(i11);
                            }
/* 408 */                   Bidi.reorderVisually(bArr, 0, o0iOioIo0lArr, 0, runCount);
/* 411 */                   if (i != lineStart) {
/* 495 */                       int i12 = i3;
/* 504 */                       int iI00IlilI0i0i2 = i > i2 ? I00IlilI0i0i(i, lineStart) : i;
/* 505 */                       int i13 = 0;
                                while (true) {
/* 506 */                           if (i13 >= runCount) {
/* 518 */                               i13 = i4;
                                        break;
                                    }
/* 512 */                           if (o0iOioIo0lArr[i13].I00000oOI == iI00IlilI0i0i2) {
                                        break;
                                    }
/* 515 */                           i13++;
                                }
/* 534 */                       boolean z7 = (z || z5 == o0iOioIo0lArr[i13].I0000Il00O) ? z5 : !z5;
                                return (i13 == 0 && z7) ? layout.getLineLeft(i12) : (i13 != runCount + (-1) || z7) ? z7 ? layout.getPrimaryHorizontal(o0iOioIo0lArr[i13 - 1].I00000oOI) : layout.getPrimaryHorizontal(o0iOioIo0lArr[i13 + 1].I00000oOI) : layout.getLineRight(i12);
                            }
/* 413 */                   int i14 = 0;
                            while (true) {
/* 414 */                       if (i14 >= runCount) {
/* 426 */                           i14 = i4;
                                    break;
                                }
/* 420 */                       if (o0iOioIo0lArr[i14].I00000oIO == i) {
                                    break;
                                }
/* 423 */                       i14++;
                            }
/* 442 */                   boolean z8 = (z || z5 == o0iOioIo0lArr[i14].I0000Il00O) ? !z5 : z5;
/* 443 */                   if (i14 == 0 && z8) {
/* 449 */                       return layout.getLineLeft(i3);
                            }
                            return (i14 != runCount + (-1) || z8) ? z8 ? layout.getPrimaryHorizontal(o0iOioIo0lArr[i14 - 1].I00000oIO) : layout.getPrimaryHorizontal(o0iOioIo0lArr[i14 + 1].I00000oIO) : layout.getLineRight(i3);
                        }
/* 331 */               z4 = true;
                    }
/* 333 */           int i15 = i3;
/* 585 */           boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
/* 589 */           if (z || z5 == zIsRtlCharAt) {
/* 598 */               z5 = !z5 ? z4 : false;
                    }
                    return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i15) : layout.getLineRight(i15);
                }

                public void I00IOO(String str, String str2) {
/* 5 */             ((Io1IlO1I1i) this.I00iio).I0000oI00(str, str2);
                }

                public boolean I00IioO0OiOi() {
                    ApplicationInfo applicationInfo;
                    Bundle bundle;
/* 5 */             IlIoliIO ilIoliIO = (IlIoliIO) this.I00iiO;
/* 7 */             ilIoliIO.I00000oIO();
/* 10 */            Context context = ilIoliIO.I00000oIO;
                    try {
/* 12 */                PackageManager packageManager = context.getPackageManager();
/* 16 */                if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Barcode.FORMAT_ITF)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
/* 45 */                    return false;
                        }
/* 40 */                return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
                    } catch (PackageManager.NameNotFoundException unused) {
/* 45 */                return false;
                    }
                }

                public int I00IlilI0i0i(int i, int i2) {
/* 1 */             while (i > i2) {
/* 13 */                char cCharAt = ((Layout) this.I00iiI).getText().charAt(i - 1);
/* 19 */                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((O0000Ioio00.I0000oI00(cCharAt, 8192) < 0 || O0000Ioio00.I0000oI00(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
/* 58 */                    return i;
                        }
                        i--;
                    }
/* 106 */           return i;
                }

                public void I00Io1lO(String str, I00Ol00 i00Ol00) {
/* 5 */             if (str.length() <= 0) {
/* 85 */                I000II.I000iOII("method.isEmpty() == true");
/* 106 */               return;
                    }
/* 9 */             if (i00Ol00 == null) {
/* 17 */                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
/* 58 */                    I000II.I0010I0i(IlIi0I0.I000lI("method ", str, " must have a request body."));
/* 61 */                    return;
                        }
                    } else if (!io0IoloO1.I00000oIO(str)) {
/* 79 */                I000II.I0010I0i(IlIi0I0.I000lI("method ", str, " must not have a request body."));
/* 82 */                return;
                    }
/* 68 */            this.I00iiO = str;
/* 70 */            this.I00ilI0I1 = i00Ol00;
                }

                public void I00Io1o110i(String str) {
/* 5 */             ((Io1IlO1I1i) this.I00iio).I0000O(str);
                }

                public void I00IoIO0lI(String str, Object obj) {
/* 5 */             ((LinkedHashMap) this.I00iiI).put(str, obj);
/* 16 */            OlO0OIIl1 olO0OIIl1 = (OlO0OIIl1) ((LinkedHashMap) this.I00iio).get(str);
/* 18 */            if (olO0OIIl1 != null) {
/* 20 */                olO0OIIl1.I000l1(obj);
                    }
/* 31 */            OlO0OIIl1 olO0OIIl12 = (OlO0OIIl1) ((LinkedHashMap) this.I00ilI0I1).get(str);
/* 33 */            if (olO0OIIl12 != null) {
/* 35 */                olO0OIIl12.I000l1(obj);
                    }
                }

                public JSONObject I00IoO0() {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 16 */            l0IlIoi1oIoO.I000O01llI0(jSONObject, "authorizationEndpoint", ((Uri) this.I00iiI).toString());
/* 29 */            l0IlIoi1oIoO.I000O01llI0(jSONObject, "tokenEndpoint", ((Uri) this.I00iiO).toString());
/* 34 */            Uri uri = (Uri) this.I00ilI0I1;
/* 36 */            if (uri != null) {
/* 44 */                l0IlIoi1oIoO.I000O01llI0(jSONObject, "registrationEndpoint", uri.toString());
                    }
/* 49 */            Uri uri2 = (Uri) this.I00iio;
/* 51 */            if (uri2 != null) {
/* 59 */                l0IlIoi1oIoO.I000O01llI0(jSONObject, "endSessionEndpoint", uri2.toString());
                    }
/* 64 */            I1iiO10I0i0O i1iiO10I0i0O = (I1iiO10I0i0O) this.I00ilO0;
/* 66 */            if (i1iiO10I0i0O != null) {
/* 72 */                l0IlIoi1oIoO.I000OOo1O(jSONObject, "discoveryDoc", i1iiO10I0i0O.I00000oIO);
                    }
/* 110 */           return jSONObject;
                }

                public void I00IoiI(String str) {
/* 8 */             if (OlOolloIIOl0.I000l1(str, "ws:", true)) {
/* 17 */                str = "http:".concat(str.substring(3));
                    } else if (OlOolloIIOl0.I000l1(str, "wss:", true)) {
/* 37 */                str = "https:".concat(str.substring(4));
                    }
/* 43 */            IoOOloOOllIO ioOOloOOllIO = new IoOOloOOllIO();
/* 47 */            ioOOloOOllIO.I0000Il00O(null, str);
/* 54 */            this.I00iiI = ioOOloOOllIO.I00000oIO();
                }

                public void I00Iooi00oi() {
/* 5 */             Iterator it = ((ArrayList) this.I00ilO0).iterator();
/* 13 */            while (it.hasNext()) {
/* 21 */                int i = ((OI1iiioIOi1) it.next()).I00000oIO;
/* 27 */                if (I001lllioOl(i) == null) {
/* 30 */                    int i2 = OI1ilOI1ioo0.I00ilI0I1;
/* 46 */                    StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Navigation destination ", l1iO11O10.I00000oIO((I1O0ol) this.I00iiO, i), " cannot be found in the navigation graph ");
/* 54 */                    sbI001IIilI0O.append((OI1lo1liOO) this.I00ilI0I1);
/* 64 */                    throw new IllegalArgumentException(sbI001IIilI0O.toString());
                        }
                    }
                }

                public llOl001olOi I00O0i0ii(o0IOi0io1iOo o0ioi0io1ioo) {
                    boolean z;
/* 3 */             ThreadLocal threadLocal = (ThreadLocal) this.I00iiI;
/* 7 */             ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iiO;
/* 13 */            llOl001olOi llol001oloi = (llOl001olOi) concurrentHashMap.get(o0ioi0io1ioo);
/* 15 */            if (llol001oloi != null) {
/* 17 */                return llol001oloi;
                    }
/* 22 */            Map map = (Map) threadLocal.get();
/* 24 */            boolean z2 = false;
/* 25 */            int i = 1;
/* 26 */            if (map == null) {
/* 30 */                map = new HashMap();
/* 33 */                threadLocal.set(map);
/* 36 */                z = true;
                    } else {
/* 42 */                llOl001olOi llol001oloi2 = (llOl001olOi) map.get(o0ioi0io1ioo);
/* 44 */                if (llol001oloi2 != null) {
/* 168 */                   return llol001oloi2;
                        }
/* 46 */                z = false;
                    }
                    try {
/* 49 */                o0I100l0o0O o0i100l0o0o = new o0I100l0o0O(i);
/* 53 */                o0i100l0o0o.I00000oOI = null;
/* 55 */                map.put(o0ioi0io1ioo, o0i100l0o0o);
/* 62 */                Iterator it = ((List) this.I00ilO0).iterator();
/* 66 */                llOl001olOi llol001oloiI00000oIO = null;
                        while (true) {
/* 71 */                    if (!it.hasNext()) {
                                break;
                            }
/* 79 */                    llol001oloiI00000oIO = ((llOo0OilI) it.next()).I00000oIO(this, o0ioi0io1ioo);
/* 83 */                    if (llol001oloiI00000oIO != null) {
/* 87 */                        if (o0i100l0o0o.I00000oOI != null) {
/* 104 */                           throw new AssertionError("Delegate is already set");
                                }
/* 89 */                        o0i100l0o0o.I00000oOI = llol001oloiI00000oIO;
/* 91 */                        map.put(o0ioi0io1ioo, llol001oloiI00000oIO);
                            }
                        }
/* 105 */               if (z) {
/* 107 */                   threadLocal.remove();
/* 110 */                   z2 = true;
                        }
/* 111 */               if (llol001oloiI00000oIO == null) {
/* 129 */                   I000II.I000iOII("GSON (2.14.0) cannot handle ".concat(String.valueOf(o0ioi0io1ioo)));
/* 52 */                    return null;
                        }
/* 113 */               if (z2) {
/* 115 */                   concurrentHashMap.putAll(map);
                        }
/* 118 */               return llol001oloiI00000oIO;
                    } catch (Throwable th) {
/* 133 */               if (z) {
/* 136 */                   threadLocal.remove();
                        }
/* 139 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:85:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00O0o1oo(String str, o0IOi0io1iOo o0ioi0io1ioo) {
/* 1 */             Object obj = null;
/* 2 */             if (str == null) {
/* 1 */                 return null;
                    }
/* 7 */             StringReader stringReader = new StringReader(str);
/* 12 */            o0IlOioo o0iloioo = new o0IlOioo();
/* 19 */            o0iloioo.I00iiO = new char[Barcode.FORMAT_UPC_E];
/* 21 */            boolean z = false;
/* 22 */            o0iloioo.I00iio = 0;
/* 24 */            o0iloioo.I00ilI0I1 = 0;
/* 26 */            o0iloioo.I00ilO0 = 0;
/* 28 */            o0iloioo.I00io1l = 0;
/* 30 */            o0iloioo.I00ioIO = 0;
/* 34 */            int[] iArr = new int[32];
/* 36 */            o0iloioo.I00ll1 = iArr;
/* 39 */            o0iloioo.I00lli11 = 1;
/* 42 */            iArr[0] = 6;
/* 46 */            o0iloioo.I00lll10 = new String[32];
/* 50 */            o0iloioo.I00o0iI0io1 = new int[32];
/* 52 */            o0iloioo.I00iOIl = stringReader;
/* 54 */            VarHandle.storeStoreFence();
/* 67 */            o0iloioo.I00iiI = 1;
                    try {
                        try {
                            try {
/* 72 */                        o0iloioo.I00ooIo0();
                                try {
/* 75 */                            llOl001olOi llol001oloiI00O0i0ii = I00O0i0ii(o0ioi0io1ioo);
/* 79 */                            Class cls = o0ioi0io1ioo.I00000oIO;
/* 81 */                            Object objI00000oIO = llol001oloiI00O0i0ii.I00000oIO(o0iloioo);
/* 163 */                           Class cls2 = cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
/* 164 */                           if (objI00000oIO != null && !cls2.isInstance(objI00000oIO)) {
/* 175 */                               String string = llol001oloiI00O0i0ii.toString();
/* 179 */                               String strValueOf = String.valueOf(cls);
/* 187 */                               String strValueOf2 = String.valueOf(objI00000oIO.getClass());
/* 213 */                               StringBuilder sb = new StringBuilder(string.length() + 47 + strValueOf.length() + 21 + strValueOf2.length() + 61);
/* 216 */                               sb.append("Type adapter '");
/* 219 */                               sb.append(string);
/* 222 */                               sb.append("' returned wrong type; requested ");
/* 225 */                               sb.append(strValueOf);
/* 228 */                               sb.append(" but got instance of ");
/* 231 */                               sb.append(strValueOf2);
/* 234 */                               sb.append("\nVerify that the adapter was registered for the correct type.");
/* 244 */                               throw new ClassCastException(sb.toString());
                                    }
/* 245 */                           obj = objI00000oIO;
                                } catch (EOFException e) {
/* 104 */                           e = e;
/* 296 */                           if (!z) {
/* 341 */                               throw new llO11IolIO(e, 25);
                                    }
/* 298 */                           o0iloioo.I00iiI = 2;
/* 300 */                           if (obj != null) {
                                    }
/* 335 */                           return obj;
                                }
                            } catch (Throwable th) {
/* 342 */                       o0iloioo.I00iiI = 2;
/* 900 */                       throw th;
                            }
                        } catch (EOFException e2) {
/* 294 */                   e = e2;
/* 295 */                   z = true;
                        }
/* 298 */               o0iloioo.I00iiI = 2;
/* 300 */               if (obj != null) {
                            try {
/* 308 */                       if (o0iloioo.I00ooIo0() != 10) {
/* 318 */                           throw new llO11IolIO("JSON document was not fully consumed.", 25);
                                }
                            } catch (o0IoiOl e3) {
/* 334 */                       throw new llO11IolIO(e3, 25);
                            } catch (IOException e4) {
/* 328 */                       throw new llIIooI0iolO(e4, 25);
                            }
                        }
/* 335 */               return obj;
                    } catch (IOException e5) {
/* 287 */               throw new llO11IolIO(e5, 25);
                    } catch (AssertionError e6) {
/* 249 */               String message = e6.getMessage();
/* 265 */               StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 30);
/* 268 */               sb2.append("AssertionError (GSON 2.14.0): ");
/* 271 */               sb2.append(message);
/* 281 */               throw new AssertionError(sb2.toString(), e6);
                    } catch (IllegalStateException e7) {
/* 293 */               throw new llO11IolIO(e7, 25);
                    }
                }

                public loo0IIIOooii I00O10llo() {
/* 3 */             loo0IIIOooii loo0iiioooii = new loo0IIIOooii();
/* 10 */            loo0iiioooii.I00000oIO = (o10Oo0i) this.I00iiI;
/* 16 */            loo0iiioooii.I00000oOI = (lolllOIlII) this.I00iiO;
/* 22 */            loo0iiioooii.I0000Il00O = (o0oIiOOlo) this.I00iio;
/* 28 */            loo0iiioooii.I0000O = (o0o0l0II1) this.I00ilI0I1;
/* 34 */            loo0iiioooii.I0000oI00 = (o0lolioio) this.I00ilO0;
/* 36 */            VarHandle.storeStoreFence();
/* 55 */            return loo0iiioooii;
                }

                public loo0IlI1li I00OI1() {
/* 3 */             loo0IlI1li loo0ili1li = new loo0IlI1li();
/* 10 */            loo0ili1li.I00000oIO = (o10OoiIiIII) this.I00iiI;
/* 16 */            loo0ili1li.I00000oOI = (lollll0111) this.I00iiO;
/* 22 */            loo0ili1li.I0000Il00O = (o0oi1iOll1lI) this.I00iio;
/* 28 */            loo0ili1li.I0000O = (o0oOI00li) this.I00ilI0I1;
/* 34 */            loo0ili1li.I0000oI00 = (o0o1Iloio) this.I00ilO0;
/* 36 */            VarHandle.storeStoreFence();
/* 55 */            return loo0ili1li;
                }

                public loo1OOo1O I00OIO1() {
/* 3 */             loo1OOo1O loo1ooo1o = new loo1OOo1O();
/* 10 */            loo1ooo1o.I00000oIO = (o10iloO1l1) this.I00iiI;
/* 16 */            loo1ooo1o.I00000oOI = (lolooOOo11o) this.I00iiO;
/* 22 */            loo1ooo1o.I0000Il00O = (o0oiol1) this.I00iio;
/* 28 */            loo1ooo1o.I0000O = (o0oi101lOlo) this.I00ilI0I1;
/* 34 */            loo1ooo1o.I0000oI00 = (o0oIlOl11) this.I00ilO0;
/* 36 */            VarHandle.storeStoreFence();
/* 55 */            return loo1ooo1o;
                }

                public o01Io111 I00OIl() {
/* 3 */             o01Io111 o01io111 = new o01Io111();
/* 10 */            o01io111.I00000oIO = (o1I01i0iOo) this.I00iiI;
/* 16 */            o01io111.I00000oOI = (o011iIl) this.I00iiO;
/* 22 */            o01io111.I0000Il00O = (o10iO00iOl) this.I00iio;
/* 28 */            o01io111.I0000O = (o10OlO) this.I00ilI0I1;
/* 34 */            o01io111.I0000oI00 = (o10IIi1O010o) this.I00ilO0;
/* 36 */            VarHandle.storeStoreFence();
/* 55 */            return o01io111;
                }

                @Override
                public Object getValue() {
/* 3 */             OooioIIoi0O oooioIIoi0O = (OooioIIoi0O) this.I00ilO0;
/* 5 */             if (oooioIIoi0O != null) {
/* 55 */                return oooioIIoi0O;
                    }
/* 46 */            OooioIIoi0O oooioIIoi0OI00000oIO = new Oool0iOoooIo(((O1OI0I01i11) this.I00iiO).I00iiI.I000II(), ((O1OI0I01i11) this.I00iio).I00iiI.I0000O(), ((O1OI0I01i11) this.I00ilI0I1).I00iiI.I0000oI00()).I00000oIO((O0IOli0o0) this.I00iiI);
/* 50 */            this.I00ilO0 = oooioIIoi0OI00000oIO;
/* 55 */            return oooioIIoi0OI00000oIO;
                }

                public String toString() {
                    String str;
                    switch (this.I00iOIl) {
                        case 10:
/* 143 */                   StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
/* 148 */                   O0i11O1 o0i11O1 = (O0i11O1) this.I00iiI;
/* 151 */                   if (o0i11O1 == null) {
/* 226 */                       O0000Ioio00.I000OOo1O("kind");
/* 229 */                       throw null;
                            }
/* 153 */                   sb.append(o0i11O1);
/* 158 */                   sb.append(", level=");
/* 163 */                   O0i10o01olo o0i10o01olo = (O0i10o01olo) this.I00iiO;
/* 165 */                   if (o0i10o01olo == null) {
/* 220 */                       O0000Ioio00.I000OOo1O("level");
/* 223 */                       throw null;
                            }
/* 167 */                   sb.append(o0i10o01olo);
/* 172 */                   sb.append(", version=");
/* 177 */                   O0i0oolI o0i0oolI = (O0i0oolI) this.I00ilO0;
/* 179 */                   if (o0i0oolI == null) {
/* 214 */                       O0000Ioio00.I000OOo1O("version");
/* 217 */                       throw null;
                            }
/* 181 */                   sb.append(o0i0oolI);
/* 186 */                   sb.append(", errorCode=");
/* 193 */                   sb.append((Integer) this.I00iio);
/* 198 */                   sb.append(", message=");
/* 207 */                   return IlIi0I0.I000oI1ioi(sb, (String) this.I00ilI0I1, ')');
                        case PoseLandmark.LEFT_INDEX:
/* 64 */                    String str2 = (String) this.I00ilO0;
/* 70 */                    StringBuilder sb2 = new StringBuilder("since ");
/* 77 */                    sb2.append((OooO0oI1) this.I00iiI);
/* 82 */                    sb2.append(' ');
/* 89 */                    sb2.append((IiO0O0) this.I00iio);
/* 94 */                    Integer num = (Integer) this.I00ilI0I1;
/* 98 */                    if (num != null) {
/* 114 */                       str = " error " + num.intValue();
                            } else {
/* 96 */                        str = "";
                            }
/* 120 */                   sb2.append(str);
/* 131 */                   sb2.append(str2 != null ? ": ".concat(str2) : "");
/* 134 */                   return sb2.toString();
                        case PoseLandmark.RIGHT_THUMB:
/* 13 */                    i0O1lIi1O0IO i0o1lii1o0io = (i0O1lIi1O0IO) this.I00iio;
/* 19 */                    String strValueOf = String.valueOf((List) this.I00ilO0);
/* 23 */                    String strValueOf2 = String.valueOf(i0o1lii1o0io);
/* 42 */                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + strValueOf2.length() + 1);
/* 49 */                    IIl001iO0Io.I001lIiIIo1O(sb3, "{serializeNulls:false,factories:", strValueOf, ",instanceCreators:", strValueOf2);
/* 54 */                    sb3.append("}");
/* 57 */                    return sb3.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 685 */       public I1ii1o0(boolean z) {
/* 686 */           this.I00iOIl = 14;
                }

/* 686 */       public I1ii1o0(Map map) {
                    this.I00iOIl = 16;
/* 689 */           this.I00iiI = new LinkedHashMap(map);
/* 690 */           this.I00iiO = new LinkedHashMap();
/* 691 */           this.I00iio = new LinkedHashMap();
/* 692 */           this.I00ilI0I1 = new LinkedHashMap();
/* 693 */           Iiii00iIoO iiii00iIoO = new Iiii00iIoO(2);
                    iiii00iIoO.I00000oOI = this;
                    VarHandle.storeStoreFence();
                    this.I00ilO0 = iiii00iIoO;
                }

/* 693 */       public I1ii1o0(int i) {
                    this.I00iOIl = i;
                    switch (i) {
                        case 14:
/* 705 */                   this.I00ilO0 = new LinkedHashMap();
/* 706 */                   this.I00iiO = "GET";
/* 707 */                   this.I00iio = new Io1IlO1I1i();
                            break;
                        default:
/* 696 */                   this.I00iiI = new Object();
/* 699 */                   this.I00iio = new I1Ooo1ii0l(0);
/* 701 */                   this.I00ilI0I1 = new OI0oiiIO0();
/* 703 */                   this.I00ilO0 = new OI0oiiIO0();
                            break;
                    }
                }

/* 707 */       public I1ii1o0(int i, boolean z) {
/* 708 */           this.I00iOIl = i;
                }

/* 708 */       public I1ii1o0(OI1o1o1iO1l oI1o1o1iO1l) {
                    Intent launchIntentForPackage;
                    this.I00iOIl = 13;
/* 709 */           Context context = oI1o1o1iO1l.I00000oIO;
                    this.I00iiI = context;
/* 711 */           this.I00iiO = new I1O0ol(context);
/* 716 */           Activity activity = (Activity) OilO1oiooiII.I000II(new IlIo0o(new OoI10o0iO11O(OilO1oiooiII.I000OiO(context, new O1o0i0Ol0Oo0(25)), new O1o0i0Ol0Oo0(26)), false, new OiioI1Io0o(4)));
                    if (activity != null) {
/* 717 */               launchIntentForPackage = new Intent(context, activity.getClass());
                    } else {
/* 718 */               launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                        if (launchIntentForPackage == null) {
/* 719 */                   launchIntentForPackage = new Intent();
                        }
                    }
/* 720 */           launchIntentForPackage.addFlags(268468224);
                    this.I00iio = launchIntentForPackage;
/* 721 */           this.I00ilO0 = new ArrayList();
/* 723 */           this.I00ilI0I1 = oI1o1o1iO1l.I00000oOI.I000II();
                }

/* 723 */       public I1ii1o0(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
                    this.I00iOIl = 0;
/* 725 */           uri.getClass();
/* 726 */           this.I00iiI = uri;
/* 727 */           uri2.getClass();
/* 728 */           this.I00iiO = uri2;
/* 729 */           this.I00ilI0I1 = uri3;
/* 730 */           this.I00iio = uri4;
/* 731 */           this.I00ilO0 = null;
                }

/* 731 */       public I1ii1o0(I1iiO10I0i0O i1iiO10I0i0O) {
                    this.I00iOIl = 0;
/* 733 */           this.I00ilO0 = i1iiO10I0i0O;
/* 735 */           this.I00iiI = (Uri) i1iiO10I0i0O.I00000oIO(I1iiO10I0i0O.I0000Il00O);
/* 737 */           this.I00iiO = (Uri) i1iiO10I0i0O.I00000oIO(I1iiO10I0i0O.I0000O);
/* 739 */           this.I00ilI0I1 = (Uri) i1iiO10I0i0O.I00000oIO(I1iiO10I0i0O.I0001Ioi1lo);
/* 741 */           this.I00iio = (Uri) i1iiO10I0i0O.I00000oIO(I1iiO10I0i0O.I0000oI00);
                }

/* 741 */       public I1ii1o0(Cipher cipher) {
                    this.I00iOIl = 4;
/* 743 */           this.I00iiI = null;
/* 744 */           this.I00iiO = cipher;
/* 745 */           this.I00iio = null;
/* 746 */           this.I00ilI0I1 = null;
/* 747 */           this.I00ilO0 = null;
                }
            }
