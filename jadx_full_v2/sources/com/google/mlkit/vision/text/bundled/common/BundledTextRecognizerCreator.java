            package com.google.mlkit.vision.text.bundled.common;

            import android.content.Context;
            import android.os.RemoteException;
            import p000.IoOlilli0ol;
            import p000.OIOiOlIO01;
            import p000.i10iloI1I1;
            import p000.i10l0iOo01i;
            import p000.lII0I0I000I;
            
            public class BundledTextRecognizerCreator extends i10iloI1I1 {
                public BundledTextRecognizerCreator() {
/* 3 */             super("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                }

                @Override
                public zba newTextRecognizer(IoOlilli0ol ioOlilli0ol) throws RemoteException {
/* 29 */            throw new RemoteException("Please use newTextRecognizerWithOptions instead.");
                }

                @Override
                public zba newTextRecognizerWithOptions(IoOlilli0ol ioOlilli0ol, i10l0iOo01i i10l0ioo01i) {
/* 6 */             Context context = (Context) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 8 */             lII0I0I000I.I000II(context);
/* 21 */            return new zba(context, i10l0ioo01i.I00iOIl, i10l0ioo01i.I00iiO, i10l0ioo01i.I00ilO0, i10l0ioo01i.I00io1l);
                }
            }
