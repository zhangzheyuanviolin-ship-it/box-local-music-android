            package p000;

            import android.content.Context;
            import android.os.Process;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import kotlin.jvm.functions.Function1;
            
            public final class O00lIli0 implements Function1 {
                public final int I00iOIl;
                public O00lOo I00iiI;

                public O00lIli0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 1;
/* 3 */             char c = 1;
/* 4 */             O00lOo o00lOo = this.I00iiI;
                    switch (i) {
                        case 0:
/* 114 */                   Log.w(OOoOl0i.I00000oIO.I00000oOI(O00lOo.class).I000oI1ioi(), "CorruptionException in " + o00lOo.I00000oIO + " DataStore running in process " + Process.myPid(), (Ii01i1) obj);
/* 119 */                   return new OI0ooi10l(c == true ? 1 : 0);
                        default:
/* 9 */                     Context context = (Context) obj;
/* 11 */                    String str = o00lOo.I00000oIO;
/* 19 */                    IOoil1iiIilo iOoil1iiIilo = null;
/* 20 */                    Ii1lIO ii1lIO = new Ii1lIO(OiooIl.I00000oIO, iOoil1iiIilo, i2);
/* 26 */                    Ii1iii100O1O ii1iii100O1O = new Ii1iii100O1O(3, iOoil1iiIilo);
/* 29 */                    int i3 = OiooOOOi1.I00000oIO;
/* 34 */                    Oioo1l00 oioo1l00 = new Oioo1l00(0);
/* 37 */                    oioo1l00.I00iiI = context;
/* 39 */                    oioo1l00.I00iiO = str;
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    OiooIIlO oiooIIlO = new OiooIIlO();
/* 47 */                    oiooIIlO.I00000oIO = ii1lIO;
/* 49 */                    oiooIIlO.I00000oOI = ii1iii100O1O;
/* 51 */                    oiooIIlO.I0000Il00O = context;
/* 53 */                    oiooIIlO.I0000O = str;
/* 60 */                    oiooIIlO.I0000oI00 = new OllO00oiil(oioo1l00);
/* 62 */                    oiooIIlO.I0001Ioi1lo = null;
/* 64 */                    VarHandle.storeStoreFence();
/* 67 */                    return Collections.singletonList(oiooIIlO);
                    }
                }
            }
