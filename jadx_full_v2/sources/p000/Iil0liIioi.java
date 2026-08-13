            package p000;

            import com.google.ai.edge.gallery.worker.DownloadWorker;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.net.HttpURLConnection;
            import java.util.List;
            
            public final class Iil0liIioi extends IOoilo {
                public String I00iOIl;
                public List I00iiI;
                public List I00iiO;
                public HttpURLConnection I00iio;
                public InputStream I00ilI0I1;
                public FileOutputStream I00ilO0;
                public byte[] I00io1l;
                public OOo0ll111 I00ioIO;
                public long I00l0I0l0lO1;
                public long I00l0OO0IO;
                public long I00li1OI;
                public long I00ll1;
                public long I00lli11;
                public long I00lll10;
                public long I00o0iI0io1;
                public int I00o0l1o1o0;
                public float I00o101lO;
                public float I00oI0i;
                public Object I00oII;
                public final DownloadWorker I00oIiI10;
                public int I00oO101o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iil0liIioi(DownloadWorker downloadWorker, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00oIiI10 = downloadWorker;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00oII = obj;
                    this.I00oO101o |= Integer.MIN_VALUE;
/* 23 */            return this.I00oIiI10.I0001Ioi1lo(null, null, 0L, 0L, null, null, null, null, this);
                }
            }
