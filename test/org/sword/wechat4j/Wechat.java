/**
 * 
 */
package org.sword.wechat4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ChengNing
 * @date   2014年12月7日
 */
public class Wechat extends WechatSupport{

	public Wechat(HttpServletRequest request) {
		super(request);
	}

	@Override
	protected void onText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onVoice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onUnknown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void subscribe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void unSubscribe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void location() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void templateMsgCallback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scanCodePush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scanCodeWaitMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picSysPhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picPhotoOrAlbum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picWeixin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void locationSelect() {
		// TODO Auto-generated method stub
		
	}

  @Override
  protected void deviceBind() {
    // TODO Auto-generated method stub
    
  }

  @Override
  protected void deviceUnbind() {
    // TODO Auto-generated method stub
    
  }


}
