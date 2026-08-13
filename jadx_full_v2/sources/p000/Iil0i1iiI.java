            package p000;

            import com.google.ai.edge.gallery.worker.DownloadWorker;
            
            public final class Iil0i1iiI extends IOoilo {
                public Object I00iOIl;
                public final DownloadWorker I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iil0i1iiI(DownloadWorker downloadWorker, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiI = downloadWorker;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 12 */            return this.I00iiI.I00000oIO(this);
                }
            }
