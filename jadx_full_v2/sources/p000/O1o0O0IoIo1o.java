            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Bundle;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O1o0O0IoIo1o implements Function1 {
                public Ii0110 I00iOIl;
                public IllOOo00lI I00iiI;
                public O1o10Iiio I00iiO;
                public O1oIOiI11o0 I00iio;
                public List I00ilI0I1;
                public Ili1iIl I00ilO0;
                public OIooi1iOiOol I00io1l;
                public OIool0l11 I00ioIO;
                public OI10i0Il I00l0I0l0lO1;
                public Ol1o0O0O0 I00l0OO0IO;
                public Context I00li1OI;
                public Resources I00ll1;
                public Ol1OlloIO I00lli11;
                public String I00lll10;
                public OI10i0Il I00o0iI0io1;
                public OI10i0Il I00o0l1o1o0;
                public OloIl1l1oOii I00o101lO;

                @Override
                public final Object invoke(Object obj) {
/* 2 */             String str = (String) obj;
/* 4 */             IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 6 */             Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 19 */            I0O0il1iIl i0O0il1iIl = new I0O0il1iIl((Object) this.I00ilO0, (Object) this.I00io1l, (Object) this.I00ioIO, (IOoil1iiIilo) null, 27);
/* 23 */            Ii0110 ii0110 = this.I00iOIl;
/* 26 */            iOi1II01i0.I0000O(ii0110, io11l1li, null, i0O0il1iIl, 2);
/* 31 */            this.I00iiI.invoke();
/* 34 */            Boolean bool = Boolean.FALSE;
/* 36 */            OI10i0Il oI10i0Il = this.I00l0I0l0lO1;
/* 38 */            oI10i0Il.setValue(bool);
/* 44 */            I0IlIoI1oi0 i0IlIoI1oi0 = new I0IlIoI1oi0(6);
/* 49 */            i0IlIoI1oi0.I00iio = this.I00l0OO0IO;
/* 52 */            O1o10Iiio o1o10Iiio = this.I00iiO;
/* 54 */            i0IlIoI1oi0.I00iiO = o1o10Iiio;
/* 58 */            i0IlIoI1oi0.I00ilI0I1 = this.I00li1OI;
/* 62 */            i0IlIoI1oi0.I00ilO0 = this.I00ll1;
/* 64 */            i0IlIoI1oi0.I00io1l = ii0110;
/* 66 */            i0IlIoI1oi0.I00iiI = oI10i0Il;
/* 70 */            i0IlIoI1oi0.I00ioIO = this.I00lli11;
/* 74 */            i0IlIoI1oi0.I00l0I0l0lO1 = this.I00lll10;
/* 76 */            VarHandle.storeStoreFence();
/* 82 */            Io0IOO01iIO1 io0IOO01iIO1 = new Io0IOO01iIO1(1);
/* 85 */            io0IOO01iIO1.I00iiI = oI10i0Il;
/* 89 */            io0IOO01iIO1.I00iiO = this.I00o0iI0io1;
/* 93 */            io0IOO01iIO1.I00iio = this.I00o0l1o1o0;
/* 95 */            VarHandle.storeStoreFence();
/* 98 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00iio;
/* 102 */           if (o1oIOiI11o0.I00IlilI0i0i == null) {
/* 105 */               o1o10Iiio.I000OOo1O(false);
                    } else {
/* 109 */               o1o10Iiio.getClass();
/* 126 */               iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o1o10Iiio), IiiIil1lOIO.I00000oIO, null, new O1o1000il0l(str, o1o10Iiio, o1oIOiI11o0, io0IOO01iIO1, i0IlIoI1oi0, this.I00ilI0I1, null), 2);
                    }
/* 129 */           FirebaseAnalytics firebaseAnalyticsI00000oIO = iOIii1ooOi0I.I00000oIO();
/* 133 */           if (firebaseAnalyticsI00000oIO != null) {
/* 135 */               Ilo0li0l1[] ilo0li0l1Arr = Ilo0li0l1.I00iOIl;
/* 139 */               Bundle bundle = new Bundle();
/* 148 */               bundle.putString("capability_name", this.I00o101lO.I00000oIO);
/* 155 */               bundle.putString("model_id", o1oIOiI11o0.I00000oIO);
/* 160 */               firebaseAnalyticsI00000oIO.I00000oIO("generate_action", bundle);
                    }
/* 163 */           return OoiIlOl1iI.I00000oIO;
                }
            }
