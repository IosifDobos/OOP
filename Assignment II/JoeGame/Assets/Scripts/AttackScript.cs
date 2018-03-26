using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AttackScript : MonoBehaviour {
    int hitpoints = 0;
    float toTargert;
    float range = 5;
    // Use this for initialization
    void Start () {
        
	}
	
	// Update is called once per frame
	/// <summary>
    /// 
    /// </summary>
    void Update () {
        if (Input.GetButtonDown("Hit"))
        {
            RaycastHit hit = new RaycastHit();
            if (Physics.Raycast(transform.position, transform.TransformDirection(Vector3.forward),out hit))
            {
                toTargert = hit.distance;
                if (toTargert < range)
                {
                    hit.transform.SendMessage("DeductPoints", hitpoints, SendMessageOptions.DontRequireReceiver);
                }
            }
        }
    }
}
