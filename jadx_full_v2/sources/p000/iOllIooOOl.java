            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class iOllIooOOl implements iOllIIoo00 {
                public final ArrayList I00000oIO;

                public iOllIooOOl(Context context, iOll1Io1o111 ioll1io1o111) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.I00000oIO = arrayList;
/* 11 */            ioll1io1o111.getClass();
/* 16 */            iOloi1 ioloi1 = new iOloi1();
/* 19 */            ioloi1.I0000Il00O = ioll1io1o111;
/* 21 */            IIOO01 iioo01 = IIOO01.I0000oI00;
/* 23 */            OoIOlo1001I.I00000oOI(context);
/* 30 */            OoIOil1iIO ooIOil1iIOI0000Il00O = OoIOlo1001I.I00000oIO().I0000Il00O(iioo01);
/* 46 */            if (IIOO01.I0000O.contains(Il0IIil.I00000oIO("json"))) {
/* 53 */                iOloOIOIII0 iolooioiii0 = new iOloOIOIII0(0);
/* 56 */                iolooioiii0.I00000oOI = ooIOil1iIOI0000Il00O;
/* 58 */                VarHandle.storeStoreFence();
/* 64 */                ioloi1.I00000oIO = new O0ioIo1O0lO(iolooioiii0);
                    }
/* 71 */            iOloOIOIII0 iolooioiii02 = new iOloOIOIII0(1);
/* 74 */            iolooioiii02.I00000oOI = ooIOil1iIOI0000Il00O;
/* 76 */            VarHandle.storeStoreFence();
/* 82 */            ioloi1.I00000oOI = new O0ioIo1O0lO(iolooioiii02);
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            arrayList.add(ioloi1);
                }

                @Override
                public final void I00000oIO(iOllI01II iolli01ii) {
/* 3 */             Iterator it = this.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((iOllIIoo00) it.next()).I00000oIO(iolli01ii);
                    }
                }
            }
