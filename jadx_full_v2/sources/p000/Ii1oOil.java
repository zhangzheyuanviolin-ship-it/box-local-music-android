            package p000;

            import android.content.Context;
            import com.google.firebase.messaging.FirebaseMessagingRegistrar;
            import java.lang.invoke.VarHandle;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            public final class Ii1oOil implements IOiOiIIiii1 {
                public final int I00iOIl;
                public OOiilOlOOI I00iiI;

                public Ii1oOil(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OOiilOlOOI oOiilOlOOI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 17 */                    I1ii1o0 i1ii1o0 = (I1ii1o0) iOiOIoiiO0i;
/* 25 */                    Context context = (Context) i1ii1o0.I00000oIO(Context.class);
/* 35 */                    String strI0000Il00O = ((IlIoliIO) i1ii1o0.I00000oIO(IlIoliIO.class)).I0000Il00O();
/* 45 */                    Set setI0000oI00 = i1ii1o0.I0000oI00(OOiilOlOOI.I00000oIO(Io1Oioii1111.class));
/* 51 */                    OOiO0Il oOiO0IlI0001Ioi1lo = i1ii1o0.I0001Ioi1lo(IiIO0i100IO.class);
/* 59 */                    Executor executor = (Executor) i1ii1o0.I000iOII(oOiilOlOOI);
/* 66 */                    IOiOoii0lI0I iOiOoii0lI0I = new IOiOoii0lI0I(1);
/* 69 */                    iOiOoii0lI0I.I00000oOI = context;
/* 71 */                    iOiOoii0lI0I.I0000Il00O = strI0000Il00O;
/* 73 */                    VarHandle.storeStoreFence();
/* 76 */                    O0ioIo1O0lO o0ioIo1O0lO = new O0ioIo1O0lO(iOiOoii0lI0I);
/* 79 */                    Ii1oil ii1oil = new Ii1oil();
/* 82 */                    ii1oil.I00000oIO = o0ioIo1O0lO;
/* 84 */                    ii1oil.I0000O = setI0000oI00;
/* 86 */                    ii1oil.I0000oI00 = executor;
/* 88 */                    ii1oil.I0000Il00O = oOiO0IlI0001Ioi1lo;
/* 90 */                    ii1oil.I00000oOI = context;
/* 92 */                    VarHandle.storeStoreFence();
/* 95 */                    return ii1oil;
                        default:
/* 1 */                     return FirebaseMessagingRegistrar.lambda$getComponents$0(oOiilOlOOI, (I1ii1o0) iOiOIoiiO0i);
                    }
                }
            }
