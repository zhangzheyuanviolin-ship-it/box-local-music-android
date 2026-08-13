            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.LinkedBlockingQueue;
            
            public final class OliOIoi1Iiol implements IoOl111 {
                public volatile boolean I00iOIl;
                public ConcurrentHashMap I00iiI;
                public LinkedBlockingQueue I00iiO;

                @Override
                public final synchronized O1I1OOiol I0000Il00O(String str) {
                    OliOIoIO1iol oliOIoIO1iol;
/* 8 */             oliOIoIO1iol = (OliOIoIO1iol) this.I00iiI.get(str);
/* 10 */            if (oliOIoIO1iol == null) {
/* 14 */                LinkedBlockingQueue linkedBlockingQueue = this.I00iiO;
/* 16 */                boolean z = this.I00iOIl;
/* 18 */                oliOIoIO1iol = new OliOIoIO1iol();
/* 21 */                oliOIoIO1iol.I00iOIl = str;
/* 23 */                oliOIoIO1iol.I00ilO0 = linkedBlockingQueue;
/* 25 */                oliOIoIO1iol.I00io1l = z;
/* 27 */                VarHandle.storeStoreFence();
/* 32 */                this.I00iiI.put(str, oliOIoIO1iol);
                    }
/* 39 */            return oliOIoIO1iol;
                }
            }
