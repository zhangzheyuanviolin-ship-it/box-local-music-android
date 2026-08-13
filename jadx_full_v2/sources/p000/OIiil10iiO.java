            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            
            public abstract class OIiil10iiO {
                public static final IlIII1l[] I00000oIO = new IlIII1l[0];
                public static final IlIII1l I00000oOI;
                public static final IlIII1l I0000Il00O;
                public static final IlIII1l I0000O;
                public static final IlIII1l I0000oI00;
                public static final IlIII1l I0001Ioi1lo;
                public static final IlIII1l I000II;
                public static final IlIII1l I000O01llI0;
                public static final IlIII1l I000OOo1O;
                public static final IlIII1l I000OiO;
                public static final OOoli1l I000iOII;
                public static final OOoli1l I000l1;

                static {
/* 12 */            IlIII1l ilIII1l = new IlIII1l("vision.barcode", 1L);
/* 15 */            I00000oOI = ilIII1l;
/* 21 */            IlIII1l ilIII1l2 = new IlIII1l("vision.custom.ica", 1L);
/* 28 */            IlIII1l ilIII1l3 = new IlIII1l("vision.face", 1L);
/* 31 */            I0000Il00O = ilIII1l3;
/* 37 */            IlIII1l ilIII1l4 = new IlIII1l("vision.ica", 1L);
/* 44 */            IlIII1l ilIII1l5 = new IlIII1l("vision.ocr", 1L);
/* 47 */            I0000O = ilIII1l5;
/* 56 */            I0000oI00 = new IlIII1l("mlkit.ocr.chinese", 1L);
/* 65 */            I0001Ioi1lo = new IlIII1l("mlkit.ocr.common", 1L);
/* 74 */            I000II = new IlIII1l("mlkit.ocr.devanagari", 1L);
/* 83 */            I000O01llI0 = new IlIII1l("mlkit.ocr.japanese", 1L);
/* 92 */            I000OOo1O = new IlIII1l("mlkit.ocr.korean", 1L);
/* 98 */            IlIII1l ilIII1l6 = new IlIII1l("mlkit.langid", 1L);
/* 105 */           IlIII1l ilIII1l7 = new IlIII1l("mlkit.nlclassifier", 1L);
/* 112 */           IlIII1l ilIII1l8 = new IlIII1l("tflite_dynamite", 1L);
/* 119 */           IlIII1l ilIII1l9 = new IlIII1l("mlkit.barcode.ui", 1L);
/* 126 */           IlIII1l ilIII1l10 = new IlIII1l("mlkit.smartreply", 1L);
/* 136 */           I000OiO = new IlIII1l("mlkit.segmentation.subject", 1L);
/* 142 */           I00Ol00 i00Ol00 = new I00Ol00((char) 0, 15);
/* 147 */           i00Ol00.I001l0I00("barcode", ilIII1l);
/* 152 */           i00Ol00.I001l0I00("custom_ica", ilIII1l2);
/* 157 */           i00Ol00.I001l0I00("face", ilIII1l3);
/* 162 */           i00Ol00.I001l0I00("ica", ilIII1l4);
/* 167 */           i00Ol00.I001l0I00("ocr", ilIII1l5);
/* 172 */           i00Ol00.I001l0I00("langid", ilIII1l6);
/* 177 */           i00Ol00.I001l0I00("nlclassifier", ilIII1l7);
/* 180 */           i00Ol00.I001l0I00("tflite_dynamite", ilIII1l8);
/* 185 */           i00Ol00.I001l0I00("barcode_ui", ilIII1l9);
/* 190 */           i00Ol00.I001l0I00("smart_reply", ilIII1l10);
/* 195 */           iI1IIi1o11Ol ii1iii1o11ol = (iI1IIi1o11Ol) i00Ol00.I0000O;
/* 197 */           if (ii1iii1o11ol != null) {
/* 541 */               throw ii1iii1o11ol.I00000oIO();
                    }
/* 205 */           OOoli1l oOoli1lI00000oOI = OOoli1l.I00000oOI(i00Ol00.I00000oOI, (Object[]) i00Ol00.I0000Il00O, i00Ol00);
/* 211 */           iI1IIi1o11Ol ii1iii1o11ol2 = (iI1IIi1o11Ol) i00Ol00.I0000O;
/* 213 */           if (ii1iii1o11ol2 != null) {
/* 306 */               throw ii1iii1o11ol2.I00000oIO();
                    }
/* 215 */           I000iOII = oOoli1lI00000oOI;
/* 219 */           I00Ol00 i00Ol002 = new I00Ol00((char) 0, 15);
/* 224 */           i00Ol002.I001l0I00("com.google.android.gms.vision.barcode", ilIII1l);
/* 229 */           i00Ol002.I001l0I00("com.google.android.gms.vision.custom.ica", ilIII1l2);
/* 234 */           i00Ol002.I001l0I00("com.google.android.gms.vision.face", ilIII1l3);
/* 239 */           i00Ol002.I001l0I00("com.google.android.gms.vision.ica", ilIII1l4);
/* 244 */           i00Ol002.I001l0I00("com.google.android.gms.vision.ocr", ilIII1l5);
/* 249 */           i00Ol002.I001l0I00("com.google.android.gms.mlkit.langid", ilIII1l6);
/* 254 */           i00Ol002.I001l0I00("com.google.android.gms.mlkit.nlclassifier", ilIII1l7);
/* 259 */           i00Ol002.I001l0I00("com.google.android.gms.tflite_dynamite", ilIII1l8);
/* 264 */           i00Ol002.I001l0I00("com.google.android.gms.mlkit_smartreply", ilIII1l10);
/* 269 */           iI1IIi1o11Ol ii1iii1o11ol3 = (iI1IIi1o11Ol) i00Ol002.I0000O;
/* 271 */           if (ii1iii1o11ol3 != null) {
/* 301 */               throw ii1iii1o11ol3.I00000oIO();
                    }
/* 279 */           OOoli1l oOoli1lI00000oOI2 = OOoli1l.I00000oOI(i00Ol002.I00000oOI, (Object[]) i00Ol002.I0000Il00O, i00Ol002);
/* 285 */           iI1IIi1o11Ol ii1iii1o11ol4 = (iI1IIi1o11Ol) i00Ol002.I0000O;
/* 287 */           if (ii1iii1o11ol4 != null) {
/* 296 */               throw ii1iii1o11ol4.I00000oIO();
                    }
/* 289 */           I000l1 = oOoli1lI00000oOI2;
                }

                public static boolean I00000oIO(Context context, IlIII1l[] ilIII1lArr) {
                    try {
/* 10 */                i0i0iII i0i0iii = new i0i0iII(context, i0i0iII.I000iOII, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O);
/* 16 */                li0iiI10Iol0 li0iii10iol0 = new li0iiI10Iol0(1);
/* 19 */                li0iii10iol0.I00iiI = ilIII1lArr;
/* 21 */                VarHandle.storeStoreFence();
/* 28 */                o0IiOl o0iiolI0000Il00O = i0i0iii.I0000Il00O(li0iii10iol0);
/* 36 */                Iioi0lilII iioi0lilII = new Iioi0lilII(27);
/* 39 */                o0iiolI0000Il00O.getClass();
/* 44 */                o0iiolI0000Il00O.I0000O(OloIo0oOIO0.I00000oIO, iioi0lilII);
/* 53 */                return ((OI000Oo) lOio0o.I00000oIO(o0iiolI0000Il00O)).I00iOIl;
                    } catch (InterruptedException | ExecutionException e) {
/* 61 */                Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
/* 1 */                 return false;
                    }
                }

                public static void I00000oOI(Context context, String str) {
/* 1 */             i1ll0l i1ll0lVar = iI0l1iOio0.I00lll10;
/* 3 */             Object[] objArr = {str};
/* 8 */             liiOiioO.I00000oIO(1, objArr);
/* 16 */            I0000Il00O(context, new iIl1ol01lIiI(objArr, 1));
                }

                public static void I0000Il00O(Context context, List list) {
/* 3 */             Io0iI1l01il.I00000oOI.getClass();
/* 13 */            if (Io0ii0lOoi.I00000oIO(context) >= 221500000) {
/* 21 */                I0000O(context, I0000oI00(I000iOII, list));
/* 24 */                return;
                    }
/* 27 */            Intent intent = new Intent();
/* 34 */            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
/* 39 */            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
/* 50 */            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
/* 61 */            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
/* 64 */            context.sendBroadcast(intent);
                }

                public static void I0000O(Context context, IlIII1l[] ilIII1lArr) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 9 */             li0iiI10Iol0 li0iii10iol0 = new li0iiI10Iol0(0);
/* 12 */            li0iii10iol0.I00iiI = ilIII1lArr;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            arrayList.add(li0iii10iol0);
/* 22 */            Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 33 */            lII0I0I000I.I00000oIO("APIs must not be empty.", !arrayList.isEmpty());
/* 36 */            io1IlO1I1i.I00000oIO = arrayList;
/* 38 */            VarHandle.storeStoreFence();
/* 63 */            new i0i0iII(context, i0i0iII.I000iOII, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O).I0000O(io1IlO1I1i).I0000Il00O(new IOO0o0I1l(27));
                }

                public static IlIII1l[] I0000oI00(OOoli1l oOoli1l, List list) {
/* 5 */             IlIII1l[] ilIII1lArr = new IlIII1l[list.size()];
/* 12 */            for (int i = 0; i < list.size(); i++) {
/* 22 */                IlIII1l ilIII1l = (IlIII1l) oOoli1l.get(list.get(i));
/* 24 */                lII0I0I000I.I000II(ilIII1l);
/* 27 */                ilIII1lArr[i] = ilIII1l;
                    }
/* 89 */            return ilIII1lArr;
                }
            }
