            package p000;

            import android.content.Context;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class O11Il0 implements Function1 {
                public O11iO00I1o I00iOIl;
                public O1oIOiI11o0 I00iiI;
                public ArrayList I00iiO;
                public ArrayList I00iio;
                public Function1 I00ilI0I1;
                public boolean I00ilO0;
                public OloIl1l1oOii I00io1l;
                public Function1 I00ioIO;
                public Function1 I00l0I0l0lO1;
                public OI10i0Il I00l0OO0IO;
                public Context I00li1OI;
                public O1ol100o0O I00ll1;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             O11iO00I1o o11iO00I1o = this.I00iOIl;
/* 3 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
/* 5 */             ArrayList arrayList = this.I00iiO;
/* 7 */             ArrayList arrayList2 = this.I00iio;
/* 9 */             Function1 function1 = this.I00ilI0I1;
/* 11 */            boolean z = this.I00ilO0;
/* 13 */            OloIl1l1oOii oloIl1l1oOii = this.I00io1l;
/* 15 */            Function1 function12 = this.I00ioIO;
/* 17 */            Function1 function13 = this.I00l0I0l0lO1;
/* 19 */            OI10i0Il oI10i0Il = this.I00l0OO0IO;
/* 21 */            Context context = this.I00li1OI;
/* 23 */            O1ol100o0O o1ol100o0O = this.I00ll1;
/* 31 */            O11Iii11o o11Iii11o = new O11Iii11o(1);
/* 34 */            o11Iii11o.I00iiI = function12;
/* 36 */            o11Iii11o.I00iiO = o1oIOiI11o0;
/* 38 */            o11Iii11o.I00iio = o11iO00I1o;
/* 40 */            o11Iii11o.I00ilI0I1 = function13;
/* 42 */            o11Iii11o.I00ilO0 = oI10i0Il;
/* 44 */            VarHandle.storeStoreFence();
/* 50 */            O11Iil1 o11Iil1 = new O11Iil1(3);
/* 53 */            o11Iil1.I00iiI = o11iO00I1o;
/* 55 */            o11Iil1.I00iiO = context;
/* 57 */            o11Iil1.I00iio = oloIl1l1oOii;
/* 59 */            o11Iil1.I00ilI0I1 = o1oIOiI11o0;
/* 61 */            o11Iil1.I00ilO0 = o1ol100o0O;
/* 63 */            VarHandle.storeStoreFence();
/* 69 */            O11iO00I1o.I000oI1ioi(o11iO00I1o, o1oIOiI11o0, (String) obj, arrayList, arrayList2, function1, o11Iii11o, o11Iil1, z, 32);
/* 72 */            FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 76 */            if (firebaseAnalyticsI00000oIO != null) {
/* 78 */                Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 108 */               firebaseAnalyticsI00000oIO.I00000oIO("generate_action", iOiIOo1010i.I00000oIO(new OIoi0IIoi("capability_name", oloIl1l1oOii.I00000oIO), new OIoi0IIoi("model_id", o1oIOiI11o0.I00000oIO)));
                    }
/* 111 */           return OoiIlOl1iI.I00000oIO;
                }
            }
